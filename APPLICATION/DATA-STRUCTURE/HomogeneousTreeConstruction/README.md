# HomogeneousTreeConstruction

---
> employee and its subordinates tree hierarchy 
> in the traditional way and with the stream approach 

```
{
  "id": 10,
  "name": "radha",
  "designation": "founder",
  "managerId": 0,
  "reporters": [
    {
      "id": 100,
      "name": "adarsh",
      "designation": "it-mgr",
      "managerId": 10,
      "reporters": [
        {
          "id": 110,
          "name": "ajit",
          "designation": "it-lead",
          "managerId": 100,
          "reporters": [
            {
              "id": 121,
              "name": "aaa",
              "designation": "devloper",
              "managerId": 110,
              "reporters": []
            }
          ]
        },
        {
          "id": 130,
          "name": "vishal",
          "designation": "developer",
          "managerId": 100,
          "reporters": []
        },
        {
          "id": 120,
          "name": "mulla",
          "designation": "it-admin",
          "managerId": 100,
          "reporters": []
        },
        {
          "id": 131,
          "name": "bbb",
          "designation": "sr-developer",
          "managerId": 100,
          "reporters": []
        },
        {
          "id": 133,
          "name": "ccc",
          "designation": "developer",
          "managerId": 100,
          "reporters": []
        },
        {
          "id": 135,
          "name": "ddd",
          "designation": "jr-developer",
          "managerId": 100,
          "reporters": []
        },
        {
          "id": 138,
          "name": "eee",
          "designation": "developer",
          "managerId": 100,
          "reporters": []
        }
      ]
    },
    {
      "id": 200,
      "name": "amit",
      "designation": "finance-mgr",
      "managerId": 10,
      "reporters": [
        {
          "id": 220,
          "name": "111",
          "designation": "ca",
          "managerId": 200,
          "reporters": []
        },
        {
          "id": 230,
          "name": "222",
          "designation": "ca",
          "managerId": 200,
          "reporters": []
        }
      ]
    }
  ]
} 
```

### To Build Code 
* mvn clean package 
