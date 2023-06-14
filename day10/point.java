public class point
{
double X;
double Y;
public void setx(double X_value){
X=X_value
}
public void sety(double Y_value){
Y=Y_value
}
public double get X()	{
return X;
}
public double get Y()	{
return Y;
}
public double Square_distance_from_origin()
	{return X*X+Y*Y}
}