include db.properties.env
$(eval export $(shell sed -ne 's/ *#.*$$//; /./ s/=.*$$// p' db.properties.env))

all:
	@javac DBTest.java
	@java DBTest

clean:
	@find . -name '*.class' -exec rm -f {} \;
