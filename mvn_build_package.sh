
cd complete

rm -rf target

mvn compile

mvn package

cd ../test

./run.sh

exit
