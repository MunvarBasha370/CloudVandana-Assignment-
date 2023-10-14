function Descending(Arr)
{
    Arr.sort((num1, num2) => num2 - num1);
    return Arr;
}

const input= prompt("Enter comma separated list of numbers");

if (input)
 {
  const Arr = input.split(',').map(Number);
  if (Arr.some(isNaN))
   {
        console.log("please enter valid numbers");
   }
  else
   {
        const resArr = Descending(Arr);
        console.log("Descending order of given array :", resArr);
   }
}
else
{
  console.log("No input provided.");
}