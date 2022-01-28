package razdel11;

public class ImaNaKarta {
int nameConv;

ImaNaKarta(int name) {
	nameConv=name;
}
public void getCardName() {
	switch(nameConv%13) {
	case 0: 
		System.out.println("dvoika");
		switch(nameConv/13) {
		case 0: System.out.println("spatiq");
		break;
		case 1: System.out.println("karo");
		break;
		case 2: System.out.println("kupa");
		break;
		case 3: System.out.println("pika");
		break;
}
		break;
	case 1:  System.out.println("troika");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 2:  System.out.println("4etvorka");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 3:  System.out.println("petica");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 4:  System.out.println("6estica");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 5:  System.out.println("sedmica");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 6:  System.out.println("osmica");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 7:  System.out.println("devetka");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 8:  System.out.println("desetka");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 9:  System.out.println("vale");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 10:  System.out.println("dama");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 11:  System.out.println("pop");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}
	break;
	case 12:  System.out.println("aso");
	switch(nameConv/13) {
	case 0: System.out.println("spatiq");
	break;
	case 1: System.out.println("karo");
	break;
	case 2: System.out.println("kupa");
	break;
	case 3: System.out.println("pika");
	break;
}

}
}

}