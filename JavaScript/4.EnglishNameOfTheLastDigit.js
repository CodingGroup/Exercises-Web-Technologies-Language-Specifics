/**
 * Created by Stoyan Tenev  on 25-Oct-16.
 */
function main(input) {
    var stringLength = input[0].length;
    var lastChar = input[0].charAt(stringLength - 1);
    var num = parseInt(lastChar);
    getLastDigit(num)

    function getLastDigit(num) {
        switch (num) {

            case 1:
                console.log('one');
                break;
            case 2:
                console.log('two');
                break;
            case 3:
                console.log('three');
                break;
            case 4:
                console.log('four');
                break;
            case 5:
                console.log('five');
                break;
            case 6:
                console.log('six');
                break;
            case 7:
                console.log('seven');
                break;
            case 8:
                console.log('eigth');
                break;
            case 9:
                console.log('nine');
                break;
            case 0:
                console.log('zero');
                break;
            default:
                break;
        }
    }
}
input = ['9223372036854775806'];
main(input);