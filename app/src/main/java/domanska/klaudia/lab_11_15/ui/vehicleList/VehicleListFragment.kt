package domanska.klaudia.lab_11_15.ui.vehicleList

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import domanska.klaudia.lab_11_15.R
import domanska.klaudia.lab_11_15.databinding.FragmentVehicleListBinding
import domanska.klaudia.lab_11_15.ui.MainActivity
import java.time.LocalDate

class VehicleListFragment : Fragment() {
    private var _binding: FragmentVehicleListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: VehicleListViewModel by viewModels()
    private val adapter = VehicleListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentVehicleListBinding.inflate(layoutInflater, container, false)

        binding.vehiclesRecycler.adapter = adapter
        binding.vehiclesRecycler.layoutManager = LinearLayoutManager(context)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.vehicleList.observe(viewLifecycleOwner, {
            adapter.setData(it)

            for (vehicle in it) {
                if (vehicle.checkDate <= LocalDate.now().plusDays(7) &&
                    vehicle.checkDate > LocalDate.now()) {
                    (requireActivity() as MainActivity).setAlert("siemanko")
                }
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.vehicle_list_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.action_add -> {
                val action = VehicleListFragmentDirections.actionVehicleListFragmentToVehicleFormFragment()
                findNavController().navigate(action)
                true
            }
            R.id.action_statistics -> {
                val action = VehicleListFragmentDirections.actionVehicleListFragmentToStatisticsFragment()
                findNavController().navigate(action)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}