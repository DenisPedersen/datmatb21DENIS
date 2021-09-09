int x = (int) random(1,15);
int y = (int) random(1 ,15);
int z = (int) random(1, 12);



if (x == 10 || y == 10 || z == 10) { println("FAIL!");
}
else if (x==20 || y == 20 || z == 20) { println("FAIL!");
}
else if (x+y+z== 30) {println("Succes!");
}
else {println("FAIL!");
}
println(x);
println(y);
println(z);
