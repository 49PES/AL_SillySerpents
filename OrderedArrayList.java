import java.util.ArrayList;

public class OrderedArrayList {

  private ArrayList<Integer> _data;
  private int _index;

  public OrderedArrayList() {
    this._data = new ArrayList<Integer>(10);
    this._index = 0;
  }

  public boolean add(int value) {
    return true;
  }
  private void expand() {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ ) {
      temp[i] = _data[i];
    }
    _data = temp;
  }
  public int size() {
    return _data.size();
  }
  
  // Adds an element to the list, ensuring that ascending order is preserved
  void add(int num){
        int index = -1;
        for(int i = 0 ; i < _data.size(); i++ ){
            if(_data.get(i) >= num){
                _data.add(i, num);
                index = i;
                i = _data.size(); // This line allows the for-loop to be broken - is there any cleaner way of accomplishing this?
            }
        }
        
        if (index == -1) _data.add(num); // If the value is greater than all the values in the list, then add it to the end
    
    }

}
