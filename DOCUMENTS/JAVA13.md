 
# JAVA 13

---


### multi line string or Text Block 1st preview 

```
var data = """
			{
             "key":"value",
			 "key":"value"
			}
/*
 """
   should always in the frist line and text then folloed by 

  """
 */
```
* we can use + operator for contatination of 2 text blocks
* we can have text at the end of the block also in same line 
* we can't have text on the first line with starting of the text block 
* text alignment will start from the first """ which is starting of the text block 


### switch case yeild keyword 
```

var value = Xxxl;
var response = switch(value){
	case 1 : yeild "XXX";
	case 2 : yeild "XXX";
	case 3 : yeild "XXX";
	case 4,5 : yeild "XXX";
	default : yeild  "-----xxx---";
}

or 

var response = switch(value){
	case 1 -> "XXX";
	case 2 ->  "XXX";
	case 3 ->  "XXX";
	case 4,5 ->  "XXX";
	default ->   "-----xxx---";
}

```
---
