package ez_dev.training.mvvm_clicker;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

public class ClickerViewModel extends ViewModel {
    private static final String KEY_COUNT = "count";
    private final SavedStateHandle savedStateHandle;

    public ClickerViewModel(SavedStateHandle savedStateHandle) {
        this.savedStateHandle = savedStateHandle;
        this.savedStateHandle.set(KEY_COUNT, 0);
    }

    public LiveData<Integer> getCount() {
        return savedStateHandle.getLiveData(KEY_COUNT);
    }

    public void increase() {
        int currentValue = savedStateHandle.get(KEY_COUNT);
        savedStateHandle.set(KEY_COUNT, ++currentValue);

    }

    public void decrease() {
        int currentValue = savedStateHandle.get(KEY_COUNT);
        if (currentValue > 0) {
            savedStateHandle.set(KEY_COUNT, ++currentValue);
        }
    }
}