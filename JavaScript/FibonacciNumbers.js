/**
 * Created by stoia on 25-Oct-16.
 */
function main(lines) {
    let first = 1;
    let second = 1;
    let n = parseInt(lines[0]);
    let result = findFib(first, second, n)

    console.log(result)

    function findFib(first, second, n) {
        if (n < 2) {
            return 1;
        }
        for (let i = 2; i <= n; i++) {

            let thurth = first + second;
            first = second;
            second = thurth;
        }
        return result;
    }
}


lines = ['5'];
main(lines);