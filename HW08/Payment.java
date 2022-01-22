import java.util.ArrayList;

public interface Payment {

	double totalPrice(ArrayList<Food> foods);
	double promote(ArrayList<Food> foods);
}
