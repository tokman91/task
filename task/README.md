## Customer Rewards Application

- Simply run the app from CustomerRewards.java runnable class
  - Call the app by POST request with 
    - url: http://localhost:8080/api/rewards
    - request body sample:
    ``` json
      {
          "customerId": "client_123",
          "transactions": [
            {
              "month": "JAN",
              "items": [
                {
                  "name": "item_1",
                  "price": "120"
                },
                {
                  "name": "item_2",
                  "price": "20"
                }
              ]
            },
            {
              "month": "FEB",
              "items": [
                {
                  "name": "item_1",
                  "price": "180"
                },
                {
                  "name": "item_2",
                  "price": "110"
                },
                {
                  "name": "item_3",
                  "price": "70"
                }
              ]
            },
            {
              "month": "MAR",
              "items": []
            }
          ]
      }
    ```