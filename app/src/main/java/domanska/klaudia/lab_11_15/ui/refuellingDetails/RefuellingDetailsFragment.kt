package domanska.klaudia.lab_11_15.ui.refuellingDetails

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import domanska.klaudia.lab_11_15.R
import domanska.klaudia.lab_11_15.databinding.FragmentRefuellingDetailsBinding
import domanska.klaudia.lab_11_15.data.entity.Refueling
import java.time.format.DateTimeFormatter

class RefuellingDetailsFragment : Fragment() {
    private var _binding: FragmentRefuellingDetailsBinding? = null
    private val binding get() = _binding!!
    private val navArgs: RefuellingDetailsFragmentArgs by navArgs()
    private lateinit var viewModel: RefuellingDetailsViewModel
    private lateinit var viewModelFactory: RefuellingDetailsViewModelFactory
    private lateinit var refuelling: Refueling

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRefuellingDetailsBinding.inflate(inflater, container, false)

        viewModelFactory = RefuellingDetailsViewModelFactory(navArgs.refuellingId)
        viewModel = ViewModelProvider(this, viewModelFactory).get(RefuellingDetailsViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.refuelling.observe(viewLifecycleOwner, { refuelling ->
            this.refuelling = refuelling
            binding.refuellingPrice.text = getString(R.string.currency, refuelling.price)
            binding.refuellingPricePerLiter.text = getString(R.string.currency, refuelling.pricePerLiter)
            binding.refuellingConsumption.text = refuelling.consumption.toString()
            binding.refuellingMileage.text = getString(R.string.distance_unit, refuelling.mileage)
            binding.refuellingPlace.text = refuelling.place
            binding.refuellingDate.text = refuelling.date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            binding.refuellingDistance.text = getString(R.string.distance_unit, 312)
        })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.vehicle_details_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.edit_item -> {
                val action = RefuellingDetailsFragmentDirections.actionRefuellingDetailsFragmentToRefuellingForm(navArgs.refuellingId, navArgs.refuellingId)
                findNavController().navigate(action)
                true
            }
            R.id.remove_item -> {
                viewModel.deleteRefuelling(refuelling)
                findNavController().navigateUp()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}