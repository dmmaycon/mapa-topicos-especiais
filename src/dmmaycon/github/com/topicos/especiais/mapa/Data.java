package dmmaycon.github.com.topicos.especiais.mapa;

public class Data {

private Integer day;

private Integer month;

private Integer year;

public Data(Integer day, Integer month, Integer year) {

if ( validarData(day,month,year) ) {

this.day = day;

this.month = month;

this.year = year

}

}

 public boolean validarData(Integer dayV, Integer monthV, Integer yearV) {

if( (month<1 && month >12) || (day<1 && day>31) ||  (year <= 0) ) {

  System.out.println("Valores para dia, mês ou ano são inválidos.") 

} else {

boolean flag = false;

if(monthV == 4 || monthV==6 || monthV == 9 || monthV==11){

if(dayV<=30) {

flag = true;

} else flag = false;

}

if(monthV == 1 || monthV==3 || monthV == 5 || monthV==7 || 

    monthV==8 || monthV==10 || monthV==12){

if(dayV<=31){

flag = true;

}else{

flag = false;

}

}

if(month ==2){

if(yearV %4 ==0){

if(day<=29){

flag = true;

}else{

flag = false;

}

} else {

if(day<=28){

flag = true;

}else{

flag = false;

}

}

}

if(flag){

return true;

}else{

return false;

}

}

}



