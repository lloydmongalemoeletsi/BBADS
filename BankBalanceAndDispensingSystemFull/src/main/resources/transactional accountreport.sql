SELECT  c.client_id              AS "Client Id",
        c.surname                AS "Client Surname",
        ca.client_account_number AS "Client Account Number",
        caty.description           AS "Account Description",
        Max(ca.display_balance)  AS "Display Balance"
FROM    client c, client_account ca, account_type caty
INNER JOIN client_account
ON      c.client_id = ca.client_id
INNER JOIN account_type
ON      ca.account_type_code = caty.account_type_code
GROUP BY (c.client_id, ca.client_account_number)
