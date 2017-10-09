open System
open FuncoesDeCalculo

let executarMultiplasOperacoes n1 n2 operacoesMatematicas =    
    for operacao in operacoesMatematicas do
        printfn "%i" (operacao n1 n2)

[<EntryPoint>]
let main argv = 
    
    printfn "Informe o 1º número:"
    let n1 = Convert.ToInt32(Console.ReadLine())

    printfn "Informe o 2º número:"
    let n2 = Convert.ToInt32(Console.ReadLine())

    let operacoesMatematicas =
        [|
             somarDoisNumeros
             subtrairDoisNumeros
             multiplicarDoisNumeros
             dividirDoisNumeros
        |]

    executarMultiplasOperacoes n1 n2 operacoesMatematicas

    0
