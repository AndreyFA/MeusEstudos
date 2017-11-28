using ExemplosComMongoDB.AspNETCore.Entidades;
using MongoDB.Bson;
using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Threading;
using System.Threading.Tasks;

namespace ExemplosComMongoDB
{
    public class ProgramAsync
    {
        public static void Main(string[] args)
        {
            Task t = ManipulandoClasse();
            Console.WriteLine("Pressione ENTER");
            Console.ReadLine();
        }

        private static void MainSync()
        {
            Console.WriteLine("Esperando 10 segundos...");
            Thread.Sleep(new TimeSpan(0, 0, 10));
            Console.WriteLine("Pronto! Já esperei.");
        }

        private static async Task MainAsync()
        {
            Console.WriteLine("Esperando 10 segundos...");
            await Task.Delay(new TimeSpan(0, 0, 10));
            Console.WriteLine("Pronto! Já esperei.");
        }

        private static async Task CriandoBson()
        {
            BsonDocument livro = new BsonDocument
            {
                { "Titulo", "Guerra dos Tronos" }
            };

            livro.Add("Autor", "George R R Martin");
            livro.Add("Ano", 1999);
            livro.Add("Páginas", 856);

            BsonArray assunto = new BsonArray();
            assunto.Add("Fantasia");
            assunto.Add("Ação");

            livro.Add("Assunto", assunto);

            Console.WriteLine(livro);
        }

        private static async Task AcessandoOMongoDB()
        {
            BsonDocument livro = new BsonDocument
            {
                { "Titulo", "Guerra dos Tronos" }
            };

            livro.Add("Autor", "George R R Martin");
            livro.Add("Ano", 1999);
            livro.Add("Páginas", 856);

            BsonArray assunto = new BsonArray();
            assunto.Add("Fantasia");
            assunto.Add("Ação");

            livro.Add("Assunto", assunto);

            /* Acessando o servidor do MongoDB */
            string connString = "mongodb://localhost:27017";

            try
            {
                IMongoClient mongoClient = new MongoClient(connString);

                /* Acessando o banco de dados do MongoDB
                 * Observação:
                 * Caso o banco de dados solicitado não exista, o GetDatabase criará. 
                 * */
                IMongoDatabase mongoDatabase = mongoClient.GetDatabase("biblioteca");

                /* Acessando a coleção 
                 * Observação:
                 * Caso não exista a coleção solicitada, o GetCollection criará.
                 * */
                IMongoCollection<BsonDocument> livros = mongoDatabase.GetCollection<BsonDocument>("livros");

                /* Inserindo um registro na coleção. */
                await livros.InsertOneAsync(livro);

                Console.WriteLine("Registro inserido com sucesso!");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }

        private static async Task ManipulandoClasse()
        {
            Livro livro = new Livro
            {
                Titulo = "Guerra dos Tronos",
                Autor = "George R R Martin",
                Ano = 1999,
                Paginas = 856,
                Assunto = new List<string> { "Fantasia", "Ação" }
            };

            /* Acessando o servidor do MongoDB */
            string connString = "mongodb://localhost:27017";

            try
            {
                IMongoClient mongoClient = new MongoClient(connString);

                /* Acessando o banco de dados do MongoDB
                 * Observação:
                 * Caso o banco de dados solicitado não exista, o GetDatabase criará. 
                 * */
                IMongoDatabase mongoDatabase = mongoClient.GetDatabase("biblioteca");

                /* Acessando a coleção 
                 * Observação:
                 * Caso não exista a coleção solicitada, o GetCollection criará.
                 * */
                IMongoCollection<Livro> livros = mongoDatabase.GetCollection<Livro> ("livros");

                /* Inserindo um registro na coleção. */
                await livros.InsertOneAsync(livro);

                Console.WriteLine("Registro inserido com sucesso!");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
