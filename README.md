![Missing title image](https://github.com/un0btanium/FactorioScript/blob/master/images/factorioscript.png)

# FactorioScript
A compiler for the game Factorio to allow the use of programming code to generate combinator logic, which can then be imported via blueprint strings into the game.


## Releases

Check the [release page](https://github.com/un0btanium/FactorioScript/releases) for the up-to-date versions.

## Use

1. Download *factorioscript.jar* and *factorioscript.bat* from the release page.  
2. Create a file (e.g. *myScript.txt*), open it and start coding (see below for available instructions).  
3. Save your code and drag and drop your file (*myScript.txt*) onto the *factorioscript.bat* file.
4. If everything runs smooth it should create a *blueprint.txt* file containing the blueprint string. Open factorio and import it via the blueprint library (available Factorio Version 0.15).

## Available instructions

### Statements

You can assign values to a variable (in Factorio know as Signals):
```FactorioScript
iron-ore = 42
```

You can copy values from other variables/signals over:

```FactorioScript
iron-ore = copper-ore
```

You can use math expressions:

```FactorioScript
iron-ore = 21 + 21
iron-ore = 84 - 42
iron-ore = 164 / 4
iron-ore = 6 * 7
iron-ore = 142 % 100
```

Of course, you can do math with variables/signals as well:

```FactorioScript
iron-ore = copper-ore + 42
iron-ore = copper-ore - 42
iron-ore = copper-ore / 42
iron-ore = copper-ore * 42
iron-ore = copper-ore % 42
```

You can chain multiple expressions:

```FactorioScript
iron-ore = copper-ore + 42 * coal / stone - signal-A
```

You can use parentheses to force the order of expression evaluation. The following expression would first devide coal by stone then multiple with 42.

```FactorioScript
iron-ore = copper-ore + 42 * (coal / stone) - signal-A
```

If you dont want to override a variable but rather want to add or subtract you can use:

```FactorioScript
iron-ore = iron-ore + 42
iron-ore += 42

iron-ore = iron-ore - 42
iron-ore -= 42
```

### Compiler Settings

There are a few, but very powerful compiler settings you can use.  

**Aliases**  
You can give a signal a custom variable name:
```FactorioScript
# ALIAS copper-ore => myAwesomeVariable
# alias iron-ore => anotherCoolVariable
anotherCoolVariable = myAwesomeVariable + 42
```

The above would be the same as:
```FactorioScript
iron-ore = copper-ore + 42
```

Just make sure your variable names start with a lowercase letter.

**Standard temporary variables**  
This one will probably be very rarely used and is not as easy to explain, but bare with me.
If you have a statement like this

```FactorioScript
iron-ore = copper-ore + stone + coal + uranium-ore
```
it will create a chain of arithmetic combinators, calculating one expression after another, which requires the result to be transfered to the next combinator. The signals used to transfer the results are the standard temporary variables.  
You should avoid using these two variables in your code, but if you need them, you can change them to a different signal you current are not using.

```FactorioScript
# STANDARD => <variableLeft> <variableRight>
```
The standard settings are 

```FactorioScript
# STANDARD => signal-Y signal-Z
```
So, if you need *signal-Y* and *signal-Z* in your equations, just change them with this compiler statement.  
If you dont do that, your results will be messed up.


## Ingame Usage

![Missing tutorial](https://github.com/un0btanium/FactorioScript/blob/master/images/fstut.png)


## More Complex Example

![Missing example pic](https://github.com/un0btanium/FactorioScript/blob/master/images/fscomplex.png)

## Future features

Well, i would like to add everything, but here is a good starting selection:

* power and other operators
* More direct assign statements (*=, /=, ^=, ect)
* IF statements
* select your power pole of choice
* Math and Util library


## Libraries

I used the awesome [ANTLR4 library](http://www.antlr.org/) to parse the code. Huge thanks to Terence Parr and his tools, without them this would have been a much more cumbersum and timeconsuming project.
