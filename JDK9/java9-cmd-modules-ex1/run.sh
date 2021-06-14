/bin/rm -rf output

mkdir -p output/mlib

mkdir -p output/classes
javac -d output/classes `find first/com/espark/adarsh/first -name *.java`
jar -c -f output/mlib/first.jar -C output/classes .
/bin/rm -rf output/classes

mkdir -p output/classes
javac -d output/classes `find second/com/espark/adarsh/second -name *.java`
jar -c -f output/mlib/second.jar -C output/classes .
/bin/rm -rf output/classes

mkdir -p output/classes
javac -cp output/mlib/first.jar:output/mlib/second.jar -d output/classes `find main/com/espark/adarsh/main -name *.java`
jar -c -f output/mlib/main.jar -C output/classes .
/bin/rm -rf output/classes

java -classpath output/mlib/first.jar:output/mlib/second.jar:output/mlib/main.jar com.espark.adarsh.main.ApplicationMain
