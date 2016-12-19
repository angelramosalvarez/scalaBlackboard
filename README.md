# Scala Blackboard

This contain some examples in order to understand Scala concepts.

  --------

###### HigherOrderFunctions
 - Functions that take other functions as parameters or that return functions as results.

###### ByValueByName:
- Call by name: has the advantage that a function argument is not evaluated if the parameter is unused in the evaluation of the body.
- Call-by-value: has the advantage that it evaluates every function argument only once.

######  FoldLeftAndReduceLeft:
- ReduceLeft: Insert a given binary operator between adjacent elements of a list
- FoldLeft: is like reduceLeft but takes an accumulator, z, as an additional parameter, which is returned when foldLeft is called on an empty list