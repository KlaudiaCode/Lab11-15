package domanska.klaudia.lab_11_15.ui.vehicleForm

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import domanska.klaudia.lab_11_15.R
import domanska.klaudia.lab_11_15.databinding.FragmentVehicleFormBinding
import domanska.klaudia.lab_11_15.data.entity.Vehicle
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class VehicleFormFragment : Fragment(), DatePickerDialog.OnDateSetListener {
    private var _binding: FragmentVehicleFormBinding? = null
    private val binding get() = _binding!!
    private val navArgs: VehicleFormFragmentArgs by navArgs()
    private var isEditing = false
    private var vehicle: Vehicle? = null
    private lateinit var viewModel: VehicleFormViewModel
    private lateinit var viewModelFactory: VehicleFormViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentVehicleFormBinding.inflate(layoutInflater, container, false)
        viewModelFactory = VehicleFormViewModelFactory(navArgs.vehicleId)
        viewModel = ViewModelProvider(this, viewModelFactory).get(VehicleFormViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.checkDateInput.setText(viewModel.localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))

        viewModel.vehicle.observe(viewLifecycleOwner, {
            it?.let {
                vehicle = it
                binding.brandInput.setText(vehicle!!.brand)
                binding.modelInput.setText(vehicle!!.model)
                binding.plateNumberInput.setText(vehicle!!.licensePlate)
                binding.checkDateInput.setText(vehicle!!.checkDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))
                viewModel.localDate = vehicle!!.checkDate
                isEditing = true
            }
        })

        binding.checkDateInput.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                requireContext(),this,
                viewModel.localDate.year,
                viewModel.localDate.monthValue-1,
                viewModel.localDate.dayOfMonth)
            datePickerDialog.show()
        }

        binding.addVehicleButton.setOnClickListener {
            val brand = binding.brandInput.text.toString()
            val model = binding.modelInput.text.toString()
            val plateNumber = binding.plateNumberInput.text.toString()

            if (brand.isBlank() || model.isBlank() || plateNumber.isBlank()) {
                Toast.makeText(context, getString(R.string.empty_fields), Toast.LENGTH_LONG).show()
            } else {
                if (isEditing) {
                    vehicle!!.brand = brand
                    vehicle!!.model = model
                    vehicle!!.licensePlate = plateNumber
                    vehicle!!.checkDate = viewModel.localDate
                    viewModel.updateVehicle(vehicle!!)
                } else {
                    val vehicleToSave = Vehicle(brand, model, plateNumber, viewModel.localDate)
                    viewModel.insertVehicle(vehicleToSave)
                    findNavController().navigateUp()
                }
            }
        }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        viewModel.localDate = LocalDate.of(year, month+1, dayOfMonth)
        binding.checkDateInput.setText(getString(R.string.date_format, dayOfMonth, month+1, year))
    }
}