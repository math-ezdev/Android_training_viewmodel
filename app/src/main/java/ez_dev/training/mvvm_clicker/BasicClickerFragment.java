package ez_dev.training.mvvm_clicker;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ez_dev.training.mvvm_clicker.databinding.FragmentBasicClickerBinding;


public class BasicClickerFragment extends Fragment {
    private FragmentBasicClickerBinding binding;

    private int count;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentBasicClickerBinding.inflate(inflater, container, false);

        //
        count = 0;
        binding.tvCount.setText(String.valueOf(count));
        binding.btnDecrease.setOnClickListener(view -> {
            if (count > 0) {
                binding.tvCount.setText(String.valueOf(--count));
            }
        });
        binding.btnIncrease.setOnClickListener(view -> {
            binding.tvCount.setText(String.valueOf(++count));
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}