function revS(input)
{
    const sentence=input.split(" ");
    const rev=sentence.map(w=>
        {
            return w.split("").reverse().join("");
        })
    const revS=rev.join(" ");
    return revS;
}
const input=prompt("whenever we find something");
if(input)
{
    console.log("reverse of sentence :",revS(input));
}
else
{
    console.log("input is not given");
}