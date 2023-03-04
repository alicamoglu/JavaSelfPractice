package day08_tasks;

public class  HTTP_code_list$$ {
    public static void main(String[] args) {

        // solution 2 : with switch statement
/*

        int statusCode = 200;
        String codeMeaning = "";
    switch (statusCode) {
        case 200:
            codeMeaning = "OK";
            break;
        case 201:
            codeMeaning = "Created";
            break;
        case 202:
            codeMeaning = "Accepted";
            break;
        case 301:
            codeMeaning = "Moved Permanently";
            break;
        case 303:
            codeMeaning = "See Other";
            break;
        case 304:
            codeMeaning = "Not Modified";
            break;
        case 307:
            codeMeaning = "Temporary Redirect";
            break;
        case 400:
            codeMeaning = "Bad Request";
            break;
        case 401:
            codeMeaning = "Unauthorized";
            break;
        case 403:
            codeMeaning = "Forbidden";
            break;
        case 404:
            codeMeaning = "Not Found";
            break;
        case 410:
            codeMeaning = "Gone";
            break;
        case 500:
            codeMeaning = "Internal Server Error";
            break;
        case 503:
            codeMeaning = "Service Unavailable";
            break;

    }
        System.out.println(codeMeaning);
*/

        // Solution 1: Must use ternary
        int statusCode = 202;
            String codeMeaning = (statusCode == 200) ? "OK" :
            (statusCode == 201) ? "Created" :
            (statusCode == 202) ? "Accepted" :
            (statusCode == 301) ? "Moved Permanently" :
            (statusCode == 303) ? "See Other" :
            (statusCode == 304) ? "Not Modified" :
            (statusCode == 307) ? "Temporary Redirect" :
            (statusCode == 400) ? "Bad Request" :
            (statusCode == 401) ? "Unauthorized" :
            (statusCode == 403) ? "Forbidden" :
            (statusCode == 404) ? "Not Found" :
            (statusCode == 410) ? "Gone" :
            (statusCode == 500) ? "Internal Server Error" :
            (statusCode == 503) ? "Service Unavailable": "" ;   //  TODO   why was ": ""   at the very and // "
                System.out.println(codeMeaning);


    }
}

/*
8. HTTP is the protocol that governs communications between web-servers and web clients.
        Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
        Some of the codes and their meanings are listed below:

        status codes and their meanings:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

        declare an int variable called statusCode, and a valid status code is already given
        write a program that prints out, on a line by itself, the appropriate label from the above list based on status.
        Example:
        if status code = 200
        output:
        ok
        Solution 1: Must use ternary
        Solution 2:	MUST use switch statement
*/

