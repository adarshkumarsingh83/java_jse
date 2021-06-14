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
javac -d output/classes -classpath output/mlib/first.jar:output/mlib/second.jar  `find main/com/espark/adarsh/main -name *.java`
jar -c -f output/mlib/main.jar -C output/classes .
/bin/rm -rf output/classes

echo "\n\n"
echo "module path "
java -p output/mlib \
 -m main/com.espark.adarsh.main.ApplicationMain
echo "\n\n"
echo "---------------"
echo "\n\n"
echo "class path "
java -classpath output/mlib/first.jar:output/mlib/second.jar:output/mlib/main.jar \
    com.espark.adarsh.main.ApplicationMain
echo "\n\n"