name = "praveen"
age = 29
def age_finder():
    print name, age
    for num in range(25,35):
        if num == 29:
            print str(num) + " this is %s age %s"% (name , age)
            #print str(num) + " this is {0} age {1}".format(name , age)
        elif num == 28:
            print num, "this is ganesh's age"
        else:
            print num

#def age_finder()
#age_finder()

def fib(n):    # write Fibonacci series up to n
    """Print a Fibonacci series up to n."""
    a, b = 0, 1
    while a < n:
        print a,
        a, b = b, a+b
#fib(10)


class MyEmptyClass():

    def __init__(self):
        #self.n = n

    def fib(self, n):
        self.n = n
        a, b = 0, 1
        while a < self.n:
            print a,
            a, b = b, a+b

#b = MyEmptyClass(10)
#b.fib()
b = MyEmptyClass()
b.fib(10)

/////////////////////////////////

>>>         else:
  File "<stdin>", line 1
    else:
    ^
IndentationError: k
unexpected indent
>>>             print num
{
  File "<stdin>", line 1
    print num
    ^
IndentationError: unexpected indent
>>>
>>> #def age_f
a
... #age_finder()
...
>>> def fib(n):    # write Fibonacci series up to n
...     """Print a Fibonac

...     a, b = 0, 1
...     while a < n:
...
...         a, b = b, a+b
... #fib(10)
...
...
... class MyEmptyClass():
...
...     def

...         #self.n = n
...
...     def fib(self, n):    # write Fi
...         self.n = n
...         """Print a Fibonacci series up to n."""
r
  File "<stdin>", line 17
    """Print a Fibonacci series up to n."""
           ^
SyntaxError: invalid syntax
>>>         a, b = 0, 1
  File "<stdin>", line 1
    a, b = 0, 1
    ^
IndentationError: unexpected indent
>>>         while a < self.n:
,
  File "<stdin>", line 1
    while a < self.n:
    ^
IndentationError: unexpected indent
>>>             print a,
  File "<stdin>", line 1
    print a,
    ^
IndentationError:
unexpected indent
>>>             a, b =
  File "<stdin>", line 1
    a, b =
    ^
IndentationError: unexpected indent
>>>
>>> #b = MyEmptyClass(10)
u
... #b.fib()

... b
.
Traceback (most recent call last):
  File "<stdin>", line 3, in <module>
NameError: name 'b' is not defined
>>> b.fib(10)
e
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'b' is not defined
>>> [cloudera@quickstart pyt
  File "
<stdin>", line 1
    [cloudera@quickstart pyt
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart python-code]$
  File "<stdin>", line 1
    [cloudera@quickstart python-code]$
             ^
SyntaxError: invalid syntax
o
>>> [cloudera@quick
  File "<stdin>", line 1
    [cloudera@quick
        r
     ^
SyntaxError: invalid syntax
>>> [cloudera@qui
t
  File "<stdin>", line 1
    [cloudera@qui
             ^
SyntaxError: invalid syntax
>>>   File "first1.py", line 31
  File "<stdin>", line 1
    File "first1.py", line 31
    ^
IndentationError: unexpected indent
>>>     de
  File "<stdin>", line 1
    de
    ^
IndentationError: unexpected indent
>>>       ^
  File "<stdin>", line 1
    ^
    ^
IndentationError: unexpected indent
>>> IndentationError: expecte
e
  File "<stdin>", line 1
    IndentationError: expecte
                    ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart python-code]$
p
  File "<stdin>", line 1
    [cloudera@quickstart python-code]$
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart python-code]$
  File "<stdin>", line 1
.
    [cloudera@quickstart python-code]$
             ^
SyntaxError: invalid syntax
>>> [cloudera@qu
c
  File "<stdin>", line 1
    [cloudera@qu
             ^
SyntaxError: invalid syntax
>>> name = "praveen"
"
>>> age = 29
>>> def age_finder():
n
...     print name, age
...     f
...         if num == 29:
s
  File "<stdin>", line 4
    if num == 29:
    ^
IndentationError: unexpected indent
>>>
...             #pr
g
...         el
b
  File "<stdin>", line 3
    el
    ^
IndentationError: unexpected indent
>>>
...         else:
e
  File "<stdin>", line 2
    else:
    ^
IndentationError: unexpected indent
>>>

...
>>> #def age_finder()
... #age_finder()
e
...

>>> def fib(n):    # write Fibonacci series up to n
o
...     """Print a Fibonacci series up to n."""
...     a, b = 0, 1
...     while a < n:
,
...         print a,

...         a, b = b,

... #fib(10)
...
>>>
o
>>> class MyEmptyClass():
d
...
  File "<stdin>", line 2

    ^
IndentationError: expected an indented block
>>>     def __init__(
  File "<stdin>", line 1
    def __init__(
    ^
IndentationError: unexpected indent
>>>
A
...
>>>     def fib(self
  File "<stdin>", line 1
    def fib(self
    ^
IndentationError: unexpected indent
>>>         self.n = n
  File "<stdin>t
", line 1
    self.n = n
    ^
IndentationError: unexpected indent
>>>
...         a, b = 0, 1
n
  File "<stdin>", line 2
    a, b = 0, 1
    ^
IndentationError: unexpected indent
>>>
T
...             print a,
  File "<stdin>", line 2
    print a,
    ^
IndentationError: unexpected indent
>>>             a, b = b, a+b
  File "<stdin>", line 1
    a, b = b, a+b
    ^
IndentationError: unexpected indent
>>>
>>> #b = MyEmptyCla
... #b.fib()
... b = MyEmptyClass()
Traceback (most recent call last):
  File "<stdin>", line 3, in <module>
NameError: name 'MyEmptyClass' is not defined
>>> b.f
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'b' is not defined
>>> [cloudera@quickstart py
  File "<stdin>", line 1
    [cloudera@quickstart py
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart pyt
  File "<stdin>", line 1
    [cloudera@quickstart pyt
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart
  File "<stdin>", line 1
    [cloudera@quickstart
             ^
SyntaxError: invalid syntax
>>>
>>>   File "first
  File "<stdin>", line 1
    File "first
    ^
IndentationError: unexpected indent
>>>     def fib(s
  File "<stdin>", line 1
    def fib(s
    ^
IndentationError: unexpected indent
>>>
>>> IndentationError: expected an indented block
  File "<stdin>", line 1
    IndentationError: expected an indented block
                    ^
SyntaxError: invalid syntax
>>> [cloudera@quicksta
  File "<stdin>", line 1
    [cloudera@quicksta
             ^
SyntaxError: invalid syntax
>>> [cloudera@quick
  File "<stdin>", line 1
    [cloudera@quick
             ^
SyntaxError: invalid syntax
>>> [cloudera@quicks
  File "<stdin>", line 1
    [cloudera@quicks
             ^
SyntaxError: invalid syntax
>>>   File "first1.py", line 31
  File "<stdin>", line 1
    File "first1.py", line 31
    ^
IndentationError: unexpected indent
>>>     def f
  File "<stdin>", line 1
    def f
    ^
IndentationError: unexpected indent
>>>
>>> I
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'I' is not defined
>>> [cloudera@quickstart python
  File "<stdin>", line 1
    [cloudera@quickstart python
             ^
SyntaxError: invalid syntax
>>> [cloudera@quicksta
  File "<stdin>", line 1
    [cloudera@quicksta
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart python-code]$ pyt
  File "<stdin>", line 1
    [cloudera@quickstart python-code]$ pyt
             ^
SyntaxError: invalid syntax
>>>   File "first1.py", line 31
  File "<stdin>", line 1
    File "first1.py", line 31
    ^
IndentationError: unexpected indent
>>>     def fib(self, n
  File "<stdin>", line 1
    def fib(self, n
    ^
IndentationError: unexpected indent
>>>       ^
  File "<stdin>", line 1
    ^
    ^
IndentationError: unexpected indent
>>> Indentation
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'Indentation' is not defined
>>> [cloudera@quickstart pyth
  File "<stdin>", line 1
    [cloudera@quickstart pyth
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart
  File "<stdin>", line 1
    [cloudera@quickstart
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart pyt
  File "<stdin>", line 1
    [cloudera@quickstart pyt
             ^
SyntaxError: invalid syntax
>>> [cloude
... [cloudera@quickstart python-code]$ python first1.p
  File "<stdin>", line 2
    [cloudera@quickstart python-code]$ python first1.p
             ^
SyntaxError: invalid syntax
>>> 0 1 1 2 3 5 8
  File "<stdin>", line 1
    0 1 1 2 3 5 8
      ^
SyntaxError: invalid syntax
>>> [cloudera@quic
  File "<stdin>", line 1
    [cloudera@quic
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart python-code]$
  File "<stdin>", line 1
    [cloudera@quickstart python-code]$
             ^
SyntaxError: invalid syntax
>>> [cloudera@qui
  File "<stdin>", line 1
    [cloudera@qui
             ^
SyntaxError: invalid syntax
>>> [cloudera@quicksta
  File "<stdin>", line 1
    [cloudera@quicksta
             ^
SyntaxError: invalid syntax
>>> [cloudera@quicks
  File "<stdin>", line 1
    [cloudera@quicks
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart python-code]$
  File "<stdin>", line 1
    [cloudera@quickstart python-code]$
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart python-code]$
  File "<stdin>", line 1
    [cloudera@quickstart python-code]$
             ^
SyntaxError: invalid syntax
>>> [cloudera@quickstart python-code]$ python
  File "<stdin>", line 1
    [cloudera@quickstart python-code]$ python
             ^
SyntaxError: invalid syntax
>>> Python 2.6.6 (r266:8429
  File "<stdin>", line 1
    Python 2.6.6 (r266:8429
             ^
SyntaxError: invalid syntax
>>> [GCC 4.4.7 20120313 (Red Hat 4.4.7-17)] on linux2
  File "<stdin>", line 1
    [GCC 4.4.7 20120313 (Red Hat 4.4.7-17)] on linux2
           ^
SyntaxError: invalid syntax
>>> Type "help", "copyright", "credits" or "license" for more information.
  File "<stdin>", line 1
    Type "help", "copyright", "credits" or "license" for more information.
              ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> list_example = ["praveen", 29
  File "<stdin>", line 1
    >>> list_example = ["praveen", 29
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> print list_example
  File "<stdin>", line 1
    >>> print list_example
     ^
SyntaxError: invalid syntax
>>> ['prave
  File "<stdin>", line 1
    ['prave
          ^
SyntaxError: EOL while scanning string literal
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> print list_example[0]
  File "<stdin>", line 1
    >>> print list_example[0]
     ^
SyntaxError: invalid syntax
>>> praveen
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'praveen' is not defined
>>> >>> print list_example[1]
  File "<stdin>", line 1
    >>> print list_example[1]
     ^
SyntaxError: invalid syntax
>>> 29
29
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for l in list_example:
  File "<stdin>", line 1
    >>> for l in list_example:
     ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> praveen
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'praveen' is not defined
>>> 29
29
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> name, age = list_example
  File "<stdin>", line 1
    >>> name, age = list_example
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> print name
  File "<stdin>", line 1
    >>> print name
     ^
SyntaxError: invalid syntax
>>> praveen
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'praveen' is not defined
>>> >>> print age
  File "<stdin>", line 1
    >>> print age
     ^
SyntaxError: invalid syntax
>>> 29
29
>>> >>
  File "<stdin>", line 1
    >>
     ^
SyntaxError: invalid syntax
>>> >>> print list_example[0]
  File "<stdin>", line 1
    >>> print list_example[0]
     ^
SyntaxError: invalid syntax
>>> pr
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'pr' is not defined
>>> >>> print list_example[0] = "ganesh"
  File "<stdin>", line 1
    >>> print list_example[0] = "ganesh"
     ^
SyntaxError: invalid syntax
>>>   File "<stdin>", line 1
  File "<stdin>", line 1
    File "<stdin>", line 1
    ^
IndentationError: unexpected indent
>>>     print list_example[0] = "ganesh"
  File "<stdin>", line 1
    print list_example[0] = "ganesh"
    ^
IndentationError: unexpected indent
>>>                           ^
  File "<stdin>", line 1
    ^
    ^
IndentationError: unexpected indent
>>> SyntaxError: invalid syntax
  File "<stdin>", line 1
    SyntaxError: invalid syntax
               ^
SyntaxError: invalid syntax
>>> >>> list_example[0] = "ganesh"
  File "<stdin>", line 1
    >>> list_example[0] = "ganesh"
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> print list_exa
  File "<stdin>", line 1
    >>> print list_exa
     ^
SyntaxError: invalid syntax
>>> ganesh
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'ganesh' is not defined
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for l in list_examp
  File "<stdin>", line 1
    >>> for l in list_examp
     ^
SyntaxError: invalid syntax
>>> ...     print l
  File "<stdin>", line 1
    ...     print l
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> ganesh
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'ganesh' is not defined
>>> 29
29
>>> >>> list_examp
  File "<stdin>", line 1
    >>> list_examp
     ^
SyntaxError: invalid syntax
>>> ['ganesh', 29]
['ganesh', 29]
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> tuple_example = ("pr
  File "<stdin>", line 1
    >>> tuple_example = ("pr
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> tuple_examp
  File "<stdin>", line 1
    >>> tuple_examp
     ^
SyntaxError: invalid syntax
>>> ('praveen', 2
... >>> tuple_examp
  File "<stdin>", line 2
    >>> tuple_examp
      ^
SyntaxError: invalid syntax
>>> 'praveen'
'praveen'
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> tuple_example[0] = "ganesh"
  File "<stdin>", line 1
    >>> tuple_example[0] = "ganesh"
     ^
SyntaxError: invalid syntax
>>> Traceback (most recent call last):
  File "<stdin>", line 1
    Traceback (most recent call last):
                         ^
SyntaxError: invalid syntax
>>>   File "
  File "<stdin>", line 1
    File "
    ^
IndentationError: unexpected indent
>>> TypeError: 'tuple' object does not support item assignment
  File "<stdin>", line 1
    TypeError: 'tuple' object does not support item assignment
             ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> dict_example = { "name":"praveen" ,"age":29}
  File "<stdin>", line 1
    >>> dict_example = { "name":"praveen" ,"age":29}
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> dict_example[name]
  File "<stdin>", line 1
    >>> dict_example[name]
     ^
SyntaxError: invalid syntax
>>> Traceback (most recent call last):
  File "<stdin>", line 1
    Traceback (most recent call last):
                         ^
SyntaxError: invalid syntax
>>>   File "<stdin>", l
  File "<stdin>", line 1
    File "<stdin>", l
    ^
IndentationError: unexpected indent
>>> KeyError: 'praveen'
  File "<stdin>", line 1
    KeyError: 'praveen'
            ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> dict_example["name"]
  File "<stdin>", line 1
    >>> dict_example["name"]
     ^
SyntaxError: invalid syntax
>>> 'praveen'
'praveen'
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> dict_example["age"]
  File "<stdin>", line 1
    >>> dict_example["age"]
     ^
SyntaxError: invalid syntax
>>> 29
29
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> dict_example
  File "<stdin>", line 1
    >>> dict_example
     ^
SyntaxError: invalid syntax
>>> {'age': 29, 'n
  File "<stdin>", line 1
    {'age': 29, 'n
                 ^
SyntaxError: EOL while scanning string literal
>>> >>> for l in dict_
  File "<stdin>", line 1
    >>> for l in dict_
     ^
SyntaxError: invalid syntax
>>> ...     print l
  File "<stdin>", line 1
    ...     print l
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> age
29
>>> name
'praveen'
>>> >>> for l in dict_example.keys:
  File "<stdin>", line 1
    >>> for l in dict_example.keys:
     ^
SyntaxError: invalid syntax
>>> ...     print
  File "<stdin>", line 1
    ...     print
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Traceback (most recent call last):
  File "<stdin>", line 1
    Traceback (most recent call last):
                         ^
SyntaxError: invalid syntax
>>>   File "<stdin>", line 1, in
  File "<stdin>", line 1
    File "<stdin>", line 1, in
    ^
IndentationError: unexpected indent
>>> TypeError: 'builtin_function_or_method' ob
  File "<stdin>", line 1
    TypeError: 'builtin_function_or_method' ob
             ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for l in dict_example.values:
  File "<stdin>", line 1
    >>> for l in dict_example.values:
     ^
SyntaxError: invalid syntax
>>> ...     print l
  File "<stdin>", line 1
    ...     print l
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Traceback (most recent call last):
  File "<stdin>", line 1
    Traceback (most recent call last):
                         ^
SyntaxError: invalid syntax
>>>   File
  File "<stdin>", line 1
    File
    ^
IndentationError: unexpected indent
>>> TypeError: 'builtin_function_or_method' object is not iterable
  File "<stdin>", line 1
    TypeError: 'builtin_function_or_method' object is not iterable
             ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for l in dict_example.values():
  File "<stdin>", line 1
    >>> for l in dict_example.values():
     ^
SyntaxError: invalid syntax
>>> ...     print l
  File "<stdin>", line 1
    ...     print l
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> 29
29
>>> praveen
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'praveen' is not defined
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> dict_example = { "na
  File "<stdin>", line 1
    >>> dict_example = { "na
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> name = ["praveen", "ganesh", "uday"]
  File "<stdin>", line 1
    >>> name = ["praveen", "ganesh", "uday"]
     ^
SyntaxError: invalid syntax
>>> >>> age = [29, 28, 25]
  File "<stdin>", line 1
    >>> age = [29, 28, 25]
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> dict_eaxmple1 = {"names":name, "ag
  File "<stdin>", line 1
    >>> dict_eaxmple1 = {"names":name, "ag
     ^
SyntaxError: invalid syntax
>>> >
  File "<stdin>", line 1
    >
    ^
SyntaxError: invalid syntax
>>> >>> for k, v in dic
  File "<stdin>", line 1
    >>> for k, v in dic
     ^
SyntaxError: invalid syntax
>>> ...     print k, v
  File "<stdin>", line 1
    ...     print k, v
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> ages [29, 28, 25]
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'ages' is not defined
>>> name
'praveen'
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for k, v in dict_eaxmple1(name, age):
  File "<stdin>", line 1
    >>> for k, v in dict_eaxmple1(name, age):
     ^
SyntaxError: invalid syntax
>>> ...     print 'Na
  File "<stdin>", line 1
    ...     print 'Na
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Traceback (most recent
  File "<stdin>", line 1
    Traceback (most recent
                         ^
SyntaxError: invalid syntax
>>>   File "<stdin>", line 1, in <module>
  File "<stdin>", line 1
    File "<stdin>", line 1, in <module>
    ^
IndentationError: unexpected indent
>>> TypeErr
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'TypeErr' is not defined
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for k
  File "<stdin>", line 1
    >>> for k
     ^
SyntaxError: invalid syntax
>>> ...     print 'Name {
  File "<stdin>", line 1
    ...     print 'Name {
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Traceba
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'Traceba' is not defined
>>>   File "<stdin>", line 1, in <module>
  File "<stdin>", line 1
    File "<stdin>", line 1, in <module>
    ^
IndentationError: unexpected indent
>>> TypeError: unhashable type: 'list'
  File "<stdin>", line 1
    TypeError: unhashable type: 'list'
             ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for k, v in dict_eaxmple1[name, age].iteritems():
  File "<stdin>", line 1
    >>> for k, v in dict_eaxmple1[name, age].iteritems():
     ^
SyntaxError: invalid syntax
>>> ...     print 'Name {0}?  Age {1}.'.format(k,
  File "<stdin>", line 1
    ...     print 'Name {0}?  Age {1}.'.format(k,
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Traceback (most recent call last):
  File "<stdin>", line 1
    Traceback (most recent call last):
                         ^
SyntaxError: invalid syntax
>>>   File "<stdin>", line 1, in <module>
  File "<stdin>", line 1
    File "<stdin>", line 1, in <module>
    ^
IndentationError: unexpected indent
>>> TypeError: unhashable type: 'list'
  File "<stdin>", line 1
    TypeError: unhashable type: 'list'
             ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for
  File "<stdin>", line 1
    >>> for
     ^
SyntaxError: invalid syntax
>>> ...     print 'Name {0}?  Age {1}.'.format(k,
  File "<stdin>", line 1
    ...     print 'Name {0}?  Age {1}.'.format(k,
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Name ages?  Age
  File "<stdin>", line 1
    Name ages?  Age
            ^
SyntaxError: invalid syntax
>>> Name names?  Age ['praveen', 'ganesh', 'u
  File "<stdin>", line 1
    Name names?  Age ['praveen', 'ganesh', 'u
             ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> ..
  File "<stdin>", line 1
    ..
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Trace
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'Trace' is not defined
>>>   File "<stdin>", line 1
  File "<stdin>", line 1
    File "<stdin>", line 1
    ^
IndentationError: unexpected indent
>>> TypeError: 'dictionary-itemiterato
  File "<stdin>", line 1
    TypeError: 'dictionary-itemiterato
             ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for
  File "<stdin>", line 1
    >>> for
     ^
SyntaxError: invalid syntax
>>> ...     print
  File "<stdin>", line 1
    ...     print
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Name ages?  Age [29, 28, 25].
  File "<stdin>", line 1
    Name ages?  Age [29, 28, 25].
            ^
SyntaxError: invalid syntax
>>> Name names?  Age ['praveen', 'gane
  File "<stdin>", line 1
    Name names?  Age ['praveen', 'gane
             ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for k, v in zip(dict_eaxmp
  File "<stdin>", line 1
    >>> for k, v in zip(dict_eaxmp
     ^
SyntaxError: invalid syntax
>>> ...     print 'Name {0}?  Age {1}.
  File "<stdin>", line 1
    ...     print 'Name {0}?  Age {1}.
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Tracebac
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'Tracebac' is not defined
>>>   File "<stdin>"
  File "<stdin>", line 1
    File "<stdin>"
    ^
IndentationError: unexpected indent
>>> ValueError: need more than
  File "<stdin>", line 1
    ValueError: need more than
              ^
SyntaxError: invalid syntax
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>> >>> for k, v in zip(dict_eaxmple1.iteritems
  File "<stdin>", line 1
    >>> for k, v in zip(dict_eaxmple1.iteritems
     ^
SyntaxError: invalid syntax
>>> ...     print 'Name {0}?  Ag
  File "<stdin>", line 1
    ...     print 'Name {0}?  Ag
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Traceb
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'Traceb' is not defined
>>>   File "<stdin>", line
  File "<stdin>", line 1
    File "<stdin>", line
    ^
IndentationError: unexpected indent
>>> TypeError
<type 'exceptions.TypeError'>
>>> >>> for k, v in zip(dict_eaxmple
  File "<stdin>", line 1
    >>> for k, v in zip(dict_eaxmple
     ^
SyntaxError: invalid syntax
>>>
>>>   File "<stdin>", line 2
  File "<stdin>", line 1
    File "<stdin>", line 2
    ^
IndentationError: unexpected indent
>>>
>>>     ^
  File "<stdin>", line 1
    ^
    ^
IndentationError: unexpected indent
>>> IndentationErro
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'IndentationErro' is not defined
>>> >>> for k, v in zip(dict_eaxmple1.iteritems()9name, age)):
  File "<stdin>", line 1
    >>> for k, v in zip(dict_eaxmple1.iteritems()9name, age)):
     ^
SyntaxError: invalid syntax
>>>   File "<stdin>",
  File "<stdin>", line 1
    File "<stdin>",
    ^
IndentationError: unexpected indent
>>>     for k, v in
  File "<stdin>", line 1
    for k, v in
    ^
IndentationError: unexpected indent
>>>
... SyntaxErro
Traceback (most recent call last):
  File "<stdin>", line 2, in <module>
NameError: name 'SyntaxErro' is not defined
>>> >>> for k, v in zip(d
  File "<stdin>", line 1
    >>> for k, v in zip(d
     ^
SyntaxError: invalid syntax
>>> ...     print 'Name {0}?  A
  File "<stdin>", line 1
    ...     print 'Name {0}?  A
    ^
SyntaxError: invalid syntax
>>> ...
  File "<stdin>", line 1
    ...
    ^
SyntaxError: invalid syntax
>>> Traceback (most recent call last
  File "<stdin>", line 1
    Traceback (most recent call last
                         ^
SyntaxError: invalid syntax
>>>   File "<stdin>", lin
  File "<stdin>", line 1
    File "<stdin>", lin
    ^
IndentationError: unexpected indent
>>> T
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'T' is not defined
>>> >>>
  File "<stdin>", line 1
    >>>
     ^
SyntaxError: invalid syntax
>>>
