package ez_dev.training.mvvm_clicker;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClickerViewModel extends ViewModel {
    private final MutableLiveData<Integer> _count;
    public final LiveData<Integer> count;

    private ClickerViewModel() {
        _count = new MutableLiveData<>(0);
        count = _count;
    }

    public void increase(){
        if(_count.getValue() != null){
            int currentValue = _count.getValue();
            _count.setValue(++currentValue);
        }
    }

    public void decrease(){
        if(_count.getValue() != null){
            int currentValue = _count.getValue();
            if(currentValue > 0){
                _count.setValue(--currentValue);
            }
        }
    }
}