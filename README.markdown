# ProgressEncode

LGPL License.

## Introduction

Progress OpenEdge 4GL has a function named `ENCODE`. This function is a one way
hash function that is used by many legacy applications written in Progress to
e.g. hash passwords.

Progress has stated ([http://knowledgebase.progress.com/articles/Article/P111508](http://knowledgebase.progress.com/articles/Article/P111508))
that they are not willing to make the algorithm behind the `ENCODE` function
public. This can cause problems when you need to interoperate with legacy applications.
This project contains a C# implementation of the algorithm behind the Progress `ENCODE`
function specifically to allow this kind of operability.

## Issues

The unit tests which are part of the project contain a randomly generated set
of inputs and outputs encoded by Progress. The only known issue is that Progress
does not allow `NUL` characters in strings, so I could not test this. The
list of encoded strings in the unit tests all pass.

## Bugs

Bugs should be reported through github at
[http://github.com/pvginkel/ProgressEncode/issues](http://github.com/pvginkel/ProgressEncode/issues).

## License

ProgressEncode is licensed under the LGPL 3.
