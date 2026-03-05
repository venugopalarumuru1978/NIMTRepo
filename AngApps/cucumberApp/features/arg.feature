Feature: Passing arguments
    Scenario: Test method
        Given provide values <10> and <20>
        When perform addition
        Then print result

    #specify arguments
    Scenario: adding two values method
        Given provide values <val1> and <val2>
        When perform addition of two values
        Then print those results
    
    #passing values to the arguments
    Examples:
		| val1 | val2 |
		|  10  |  20  |
		|  30  |  40  |
        |  130 |  140 |