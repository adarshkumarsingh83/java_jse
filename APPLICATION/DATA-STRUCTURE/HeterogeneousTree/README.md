# HeterogeneousTree

---

> department and employee is set in the Hierarchy\
> department is set first with main and sub department then\ 
> employees are set into the department in the Hierarchy of manager team lead and normal employee


### To Build Code
* mvn clean package

```
{
  "deptId": 101,
  "deptName": "management",
  "parentDeptId": 0,
  "employeeBean": [
    {
      "id": 10,
      "name": "radha",
      "designation": "founder",
      "managerId": 0,
      "deptId": 101
    }
  ],
  "subDepartments": [
    {
      "deptId": 3333,
      "deptName": "finance",
      "parentDeptId": 101,
      "employeeBean": [
        {
          "id": 200,
          "name": "amit",
          "designation": "finance-mgr",
          "managerId": 10,
          "deptId": 3333,
          "employees": [
            {
              "id": 220,
              "name": "111",
              "designation": "ca",
              "managerId": 200,
              "deptId": 3333
            },
            {
              "id": 230,
              "name": "222",
              "designation": "ca",
              "managerId": 200,
              "deptId": 3333
            }
          ]
        }
      ]
    },
    {
      "deptId": 1111,
      "deptName": "it",
      "parentDeptId": 101,
      "employeeBean": [
        {
          "id": 100,
          "name": "adarsh",
          "designation": "it-mgr",
          "managerId": 10,
          "deptId": 1111,
          "employees": [
            {
              "id": 110,
              "name": "ajit",
              "designation": "it-lead",
              "managerId": 100,
              "deptId": 1111,
              "employees": [
                {
                  "id": 121,
                  "name": "aaa",
                  "designation": "devloper",
                  "managerId": 110,
                  "deptId": 1111
                }
              ]
            },
            {
              "id": 120,
              "name": "mulla",
              "designation": "it-admin",
              "managerId": 100,
              "deptId": 1111
            },
            {
              "id": 130,
              "name": "vishal",
              "designation": "developer",
              "managerId": 100,
              "deptId": 1111
            },
            {
              "id": 131,
              "name": "bbb",
              "designation": "sr-developer",
              "managerId": 100,
              "deptId": 1111
            },
            {
              "id": 133,
              "name": "ccc",
              "designation": "developer",
              "managerId": 100,
              "deptId": 1111
            },
            {
              "id": 135,
              "name": "ddd",
              "designation": "jr-developer",
              "managerId": 100,
              "deptId": 1111
            },
            {
              "id": 138,
              "name": "eee",
              "designation": "developer",
              "managerId": 100,
              "deptId": 1111
            }
          ]
        }
      ]
    },
    {
      "deptId": 4444,
      "deptName": "operations",
      "parentDeptId": 101,
      "employeeBean": [
        {
          "id": 1000,
          "name": "op-1",
          "designation": "op",
          "managerId": 10,
          "deptId": 4444,
          "employees": [
            {
              "id": 1001,
              "name": "op-2",
              "designation": "op",
              "managerId": 1000,
              "deptId": 4444
            },
            {
              "id": 1002,
              "name": "op-3",
              "designation": "op",
              "managerId": 1000,
              "deptId": 4444
            }
          ]
        }
      ]
    },
    {
      "deptId": 2222,
      "deptName": "hr",
      "parentDeptId": 101,
      "employeeBean": [
        {
          "id": 500,
          "name": "hr-1",
          "designation": "hr",
          "managerId": 10,
          "deptId": 2222,
          "employees": [
            {
              "id": 5050,
              "name": "hr-2",
              "designation": "hr",
              "managerId": 500,
              "deptId": 2222
            },
            {
              "id": 6000,
              "name": "hr-2",
              "designation": "hr",
              "managerId": 500,
              "deptId": 2222
            }
          ]
        }
      ]
    }
  ]
}
```


