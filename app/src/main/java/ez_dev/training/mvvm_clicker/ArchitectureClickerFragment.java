package ez_dev.training.mvvm_clicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ez_dev.training.mvvm_clicker.databinding.FragmentArchitectureClickerBinding;

public class ArchitectureClickerFragment extends Fragment {
    private FragmentArchitectureClickerBinding binding;

    public static ArchitectureClickerFragment newInstance() {
        return new ArchitectureClickerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentArchitectureClickerBinding.inflate(inflater, container, false);
        binding.setLifecycleOwner(this);

        // ViewModel
        ClickerViewModel viewModel = new ViewModelProvider(this).get(ClickerViewModel.class);
        binding.setViewModel(viewModel);


        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}