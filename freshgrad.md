# What?

You will write a command line program that can create/list/take an order, 
to simulate a very simple Lalamove.

Please also write a README explaining your technology choices, and some instruction 
on how to run your project.

# How?

In one of the following Languages: Go, Java/Kotlin, Node.js, Swift, PHP or Python, 
implement the following mini command line app.

Data (orders) should be persistent between run, write a script called `setup.sh` 
(at the root of your repo) to do any setup/initialisation for your persistent storage 
(File, DB, or NoSQL of your choice is fine) and build your executable if needed.

Your executable should be called `llm` at the root of your repo.
it can be a bash script, or a binary compiled during the `setup.sh` script.

## Specification:

Your program can take the following arguments:

`create_order [from] [to]`
returns a unique ID for this order.
from and to are required.

`list_orders`
List all the available (non-taken) orders with this format
`ID,FROM,TO\n`

`take_order [id]`
Try to take the order with the given ID, returns an error if order is already taken.
id is required.

all errors should return a non-zero exit code. You can choose the error message you want.

## Interaction example:
```
$ llm create_order "Mong Kok" "Central"
1
$ llm create_order "TST" "SSP"
2
$ llm list_orders
1,Mong Kok,Central
2,TST,SSP
$ llm take_order 1
$ llm list_orders
2,TST,SSP
$ llm take_order 1
order already taken
$ llm take_order 42
order does not exist
```

# Questions?

Shoot an email at techchallenge@lalamove.com

Want to go the extra distance? We would love to see how you can add tests, 
documentation, add ci and include steps on how you could release this to 
"production" (bonus points for using containers).

# Finished?

When you’re ready to submit your project, send us your project by creating a 
**private** git repo:
* Github: Please add `techchallenge-lalamove` as project collaborator
* Bitbucket: Please give read access to `techchallenge@lalamove.com`
