package br.com.furb.trabalho_compiladores.lexico;
public interface ParserConstants
{
    int START_SYMBOL = 47;

    int FIRST_NON_TERMINAL    = 47;
    int FIRST_SEMANTIC_ACTION = 95;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  1,  2, -1, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  5, -1, -1, -1, -1,  6, -1, -1, -1,  5, -1,  6, -1, -1, -1,  5,  5, -1, -1, -1, -1, -1, -1,  5,  5,  5,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  7, -1, -1, -1, -1, -1, -1, -1, -1,  9, -1, -1, -1, -1, -1, 12,  8, -1, -1, -1, -1, -1, -1, 11, 13, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, -1, -1, 15, -1 },
        { 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 18, -1, -1, -1, -1, -1, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, 27 },
        { -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31 },
        { -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, 33, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 43, 43, 43, 43, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, 43, -1, -1, -1, -1, -1, -1, 43, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45 },
        { -1, 46, 46, 46, 46, -1, -1, -1, -1, -1, -1, 46, -1, -1, -1, -1, -1, -1, -1, 46, -1, -1, 47, -1, -1, -1, -1, -1, -1, 46, 46, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 54, 54, 54, 54, -1, -1, -1, -1, -1, -1, 54, -1, -1, -1, -1, -1, -1, -1, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, 54, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, 55 },
        { -1, 56, 56, 56, 56, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, 56, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 61, 61, 61, 61, -1, -1, -1, -1, -1, -1, 61, -1, -1, -1, -1, -1, -1, -1, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, 61, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 63, 62, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, -1, -1, -1, -1, -1, -1, -1, 62 },
        { -1, 65, 65, 65, 65, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, 68, -1, -1, -1, -1, -1, -1, -1, -1, -1, 66, 65, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1 },
        { -1, 69, 69, 69, 69, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 69, 69, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 69, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 71, 71, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, 71, -1, 70, 70, 70, 70, 70, 70, -1, 71 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 72, 73, 74, 75, 76, 77, -1, -1 },
        { -1, 78, 78, 78, 78, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 78, 78, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 78, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 79, 79, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, -1, -1, -1, -1, -1, -1, -1, -1, -1, 80, 81, -1, -1, 79, -1, 79, -1, 79, 79, 79, 79, 79, 79, -1, 79 },
        { -1, 82, 82, 82, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 82, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 82, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 83, 83, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 83, -1, -1, -1, -1, -1, -1, -1, -1, -1, 83, 83, 84, 85, 83, -1, 83, -1, 83, 83, 83, 83, 83, 83, -1, 83 },
        { -1, 86, 87, 88, 89, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 91, 92, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 90, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 93, 93, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 93, -1, -1, -1, -1, -1, -1, -1, -1, -1, 93, 93, 93, 93, 93, -1, 93, -1, 93, 93, 93, 93, 93, 93, 94, 93 }
    };

    int[][] PRODUCTIONS = 
    {
        {  6,  5, 48, 49, 15, 50, 13, 53 },
        { 55, 48 },
        {  0 },
        { 64 },
        {  0 },
        { 51, 37, 50 },
        {  0 },
        {  2, 52 },
        { 68 },
        { 69 },
        { 73 },
        { 75 },
        { 76 },
        { 77 },
        { 38, 83 },
        { 45, 78, 46 },
        { 54, 53 },
        {  0 },
        { 81 },
        { 82 },
        { 56 },
        { 57 },
        { 14,  2, 45, 58, 46, 36, 63, 37 },
        { 22,  2, 45, 58, 46, 37 },
        { 60, 59 },
        {  0 },
        { 37, 60, 59 },
        {  0 },
        { 61, 36, 63 },
        {  2, 62 },
        { 35,  2, 62 },
        {  0 },
        {  8 },
        { 19 },
        { 16 },
        { 24 },
        { 29, 65 },
        { 67, 66 },
        {  0 },
        { 65 },
        { 61, 36, 63, 37 },
        { 18, 45, 61, 46 },
        { 11, 45, 70, 46 },
        { 72, 71 },
        { 35, 72, 71 },
        {  0 },
        { 83 },
        { 23 },
        { 27, 83, 10, 50, 74, 13 },
        { 28, 50 },
        {  0 },
        { 25, 50,  7, 83 },
        { 17 },
        { 26, 83 },
        { 79 },
        {  0 },
        { 83, 80 },
        { 35, 83, 80 },
        {  0 },
        { 14,  2, 45, 58, 46, 36, 63, 37, 49, 15, 50, 13 },
        { 22,  2, 45, 58, 46, 37, 49, 15, 50, 13 },
        { 85, 84 },
        {  0 },
        {  9, 85, 84 },
        { 21, 85, 84 },
        { 86 },
        { 30 },
        { 12 },
        { 20, 85 },
        { 89, 87 },
        { 88, 89 },
        {  0 },
        { 39 },
        { 40 },
        { 41 },
        { 42 },
        { 43 },
        { 44 },
        { 91, 90 },
        {  0 },
        { 31, 91, 90 },
        { 32, 91, 90 },
        { 93, 92 },
        {  0 },
        { 33, 93, 92 },
        { 34, 93, 92 },
        {  2, 94 },
        {  3 },
        {  4 },
        {  5 },
        { 45, 83, 46 },
        { 31, 93 },
        { 32, 93 },
        {  0 },
        { 45, 58, 46 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado identificador",
        "Era esperado constante_inteira",
        "Era esperado constante_real",
        "Era esperado constante_caracter",
        "Era esperado algoritmo",
        "Era esperado ate",
        "Era esperado caracter",
        "Era esperado e",
        "Era esperado entao",
        "Era esperado escreva",
        "Era esperado falso",
        "Era esperado fim",
        "Era esperado funcao",
        "Era esperado inicio",
        "Era esperado inteiro",
        "Era esperado interrompa",
        "Era esperado leia",
        "Era esperado logico",
        "Era esperado nao",
        "Era esperado ou",
        "Era esperado procedimento",
        "Era esperado quebra",
        "Era esperado real",
        "Era esperado repita",
        "Era esperado retorne",
        "Era esperado se",
        "Era esperado senao",
        "Era esperado variaveis",
        "Era esperado verdadeiro",
        "Era esperado \"+\"",
        "Era esperado \"-\"",
        "Era esperado \"*\"",
        "Era esperado \"/\"",
        "Era esperado \",\"",
        "Era esperado \":\"",
        "Era esperado \";\"",
        "Era esperado \"<-\"",
        "Era esperado \"=\"",
        "Era esperado \"<>\"",
        "Era esperado \"<\"",
        "Era esperado \"<=\"",
        "Era esperado \">\"",
        "Era esperado \">=\"",
        "Era esperado \"(\"",
        "Era esperado \")\"",
        "<programa> inválido",
        "<cabecalho_modulos> inválido",
        "<variaveis_opcional> inválido",
        "<lista_comandos> inválido",
        "<comando> inválido",
        "<comando_1> inválido",
        "<lista_modulos> inválido",
        "<modulo> inválido",
        "<cabecalho> inválido",
        "<funcao_cabecalho> inválido",
        "<procedimento_cabecalho> inválido",
        "<lista_parametros> inválido",
        "<lista_parametros_adicionais> inválido",
        "<parametro> inválido",
        "<lista_identificadores> inválido",
        "<lista_identificadores_adicionais> inválido",
        "<tipo> inválido",
        "<variaveis> inválido",
        "<lista_variaveis> inválido",
        "<lista_variaveis_1> inválido",
        "<variavel> inválido",
        "<entrada_dados> inválido",
        "<saida_dados> inválido",
        "<lista_valores> inválido",
        "<lista_valores_adicionais> inválido",
        "<valor> inválido",
        "<selecao> inválido",
        "<senao_opcional> inválido",
        "<repeticao> inválido",
        "<interrompa> inválido",
        "<retorne> inválido",
        "<parametros_reais> inválido",
        "<lista_expressoes> inválido",
        "<lista_expressoes_adicionais> inválido",
        "<funcao> inválido",
        "<procedimento> inválido",
        "<expressao> inválido",
        "<expressao_1> inválido",
        "<elemento> inválido",
        "<relacional> inválido",
        "<relacional_1> inválido",
        "<operador_relacional> inválido",
        "<aritmetica> inválido",
        "<aritmetica_1> inválido",
        "<termo> inválido",
        "<termo_1> inválido",
        "<fator> inválido",
        "<fator_1> inválido"
    };
}
