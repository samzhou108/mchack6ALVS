import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSV_converter {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		String[] iList = {"15cb54b1-7983-40c7-91af-43701984d90b","3ed878a0-60aa-48c4-bb52-d64c72c6ef75", "8e4955b4-7313-451f-abc1-af165af6f080", "dd62061c-4475-4398-8569-fa0e12f62b33", "e5850a8f-5a21-49c5-80be-5270e3b126bb","eef20546-a9a9-4eea-b6ab-17fbd8752f25"};
		String[] dList = {"1543a5de-fb5b-4fe1-ade0-dbc444deb460", "01cb3f14-e2b7-4655-94cb-3cce7a9d6c1c", "1543a5de-fb5b-4fe1-ade0-dbc444deb460", "2230463c-a0ff-49ba-b2bf-289f619703e0", "3a350f35-30d8-42f2-a5d0-1c62ef80ca79", "3c811f1d-2fe9-4f21-85d8-da62868a3863", "514257c1-c3cf-4ec4-86f4-d28081a44bb4", "aeac2b55-3ae3-418e-886c-5374e232bd53"};
		String[] oList = {"0029a7f9-fd73-4629-9a2f-3170c0338420", "011611bb-cb81-437c-ab2c-14c8ee1dd819", "0923b2b9-b076-4b7c-aea2-5fe76e259035", "0a2274ed-dda2-4f37-ba8d-7b1ccb28f37c", "0b66fe33-2924-4802-8bd8-e0daf19f0f13", "0c190312-214b-4bb5-9e8c-53bebb9af853", "0c659112-2aa9-4033-85f2-ec1792b783f5", "0f89bcab-0c58-4d4f-983e-d703fd392c3d", "18c15185-fb76-43a0-b19a-cbf821108289", "1ab36730-46ca-4371-8b18-77eed7adfcb2", "1c6e552d-7c93-4dbb-999f-323588914ef6", "1cb36563-fe65-4d33-aebf-17662139400d", "262b3073-b3ed-449b-a593-798a4b1d554e", "27a1f01d-528b-4548-933c-3c87b24ba224", "2961d31a-80ce-4522-84e8-366ee1cc826e", "297d92d7-0eff-4677-bfd1-abc1b8ad5140", "2a4f21d6-ff00-4f6c-8fed-2fcf2cdadfb0", "3171402d-9e28-40c2-9b2d-0ab8647d3291", "327c82fd-f742-49f7-843a-90f14ee4a4d8", "3543de00-7868-4cef-9a9d-115b6be71a7b", "38f2d480-9a88-4774-a25c-89b2501aefe6", "3a8f40da-a97f-4d81-b3cb-f72b255eeb6b", "3d816c1a-fde7-43a1-8729-ba5b15e0b84a", "41fdbf54-244c-48d4-beb4-f673b5571dff", "4b757e15-d038-4e63-bc47-9da2aa3c1d8f", "5570e679-2e66-4350-9d96-a26224f99164", "565c317f-f016-487f-9e36-7e1b2f49c16c", "582edcad-2a7e-44a6-a3a8-c2283dbbc55e", "59422f81-516a-43a9-8a1c-ef1ee10b23ed", "5afd7f48-e947-4d5b-a815-d1c03ae46c7b", "5d3e5bd5-c1dc-405c-a9f0-86bd2295f74b", "5ec820ef-0b7e-4b5b-bf4f-2e31b68c789e", "660d60eb-15ff-412e-9f9c-93f613fde3b3", "663238c2-02e7-4ca8-a716-21e90cb9f30a", "674d21fd-db9b-4e57-97fd-b31524537a3b", "683b985d-53b6-4f95-8d5a-22a828fd8cbd", "691a9369-6765-4aaf-9874-ff0e68996080", "69c801fa-67b8-4b0e-a854-0a0dfe28e8a0", "6e3c88b7-b6e8-4644-bb46-2bb42c0c2202", "7190bc91-a1c7-4cbc-a250-98a46d011c6d", "74d3e560-b649-4f2e-8e87-3cd1619de390", "751ad074-8099-4446-a51d-188eb844c57f", "79ac35df-0bd4-46a9-bcf8-75f8f09dde08", "7caf9351-25ed-416e-bb2c-3e4dd25b0ded", "857b26a2-0da4-4b9a-b074-7757591f0368", "882123e1-079a-45c2-b6d4-640f0cc914a6", "8b5259e4-4175-4fc8-8801-8a7fdef43870", "8bd1459b-a52d-4323-a74d-585c7f67d8a1", "8e562f53-a04c-4ccd-ac90-aeedef1f6ac1", "8e67674e-6324-4675-b3ef-7804d8d6e22b", "8f7927d2-473f-4d72-a3a7-aa4e52090980", "90d050ca-813c-4a95-a97b-b7097aa9d4d7", "98808dae-e37b-4917-8d7e-cb4a9094ea08", "9c5d337c-a273-4050-b1c4-74ac3a46b938", "9ed9bc12-f2b1-464c-93ae-f0f65b3c7439", "a2613ac6-57c5-46ae-85db-a51775c6746d", "a5fe67b5-ede5-4a6a-90a2-7370b67cd882", "a787d385-a93d-4173-af59-1c77f8717240", "a92f8e98-6a6c-48a8-94c8-30ae8ff9595b", "a93af917-94b1-4ee1-a6f8-0152c1cf54b8", "ac36f7c6-28ce-45c8-a626-5f89537f7d49", "ada64b06-cabf-4656-afdb-b97f951c4244", "afedcde4-49e3-4fed-8704-9d812a3dda62", "bb856f38-7ac6-4ca6-a824-9d77211199de", "c6932e1b-d0cd-4af5-b207-0c027b3c276d", "c8c347e6-b01a-48bd-91ee-668660d3e029", "ce5070c2-54ed-4abc-91f3-23d9e9db5e5c", "db01f94f-7708-4a8e-ae98-4c5e08c563ab", "dbbd0304-ef1f-417a-8d9c-2b9079ffeef3", "dc529a5b-40da-4f12-87b8-f35abab47c18", "dd436a6a-5517-4ada-9ea2-8923f5cf42a5", "dd646870-7b15-4eef-9a0f-eab615b280c6", "ddfaea94-d559-4073-9b57-3f139a01af4d", "e21e3713-14e6-4b77-b7b1-9914b47daec0", "e2ec862e-0bd4-4d4b-84dc-35e237eb4f7d", "e8026595-992c-4932-b66a-73670a2a4855", "ea3263f3-24cb-4f62-a663-e9d68e654960", "eba9e563-bba1-4b58-9e4f-e688c8ff771f", "ef557a1a-c95c-4082-bcb5-8499451df619", "f03b4556-ec9f-4c67-ba19-77a9f0f7b8d0", "f2ceedbb-007a-4eb9-bcc3-4cb6971a5562", "f6df5be9-f85f-4c93-a500-34585f412656", "f7a66aa0-6a5e-4977-8fc0-91eadef8435f", "fba96114-7d33-4f69-b866-f07a95f7748d"};
		String[] dhList = {"18c15185-fb76-43a0-b19a-cbf821108289", "1cb36563-fe65-4d33-aebf-17662139400d", "262b3073-b3ed-449b-a593-798a4b1d554e", "3a8f40da-a97f-4d81-b3cb-f72b255eeb6b", "41fdbf54-244c-48d4-beb4-f673b5571dff", "5570e679-2e66-4350-9d96-a26224f99164", "565c317f-f016-487f-9e36-7e1b2f49c16c", "5ec820ef-0b7e-4b5b-bf4f-2e31b68c789e", "69c801fa-67b8-4b0e-a854-0a0dfe28e8a0", "751ad074-8099-4446-a51d-188eb844c57f", "857b26a2-0da4-4b9a-b074-7757591f0368", "8b5259e4-4175-4fc8-8801-8a7fdef43870", "a5fe67b5-ede5-4a6a-90a2-7370b67cd882", "afedcde4-49e3-4fed-8704-9d812a3dda62", "c6932e1b-d0cd-4af5-b207-0c027b3c276d", "e2ec862e-0bd4-4d4b-84dc-35e237eb4f7d", "e8026595-992c-4932-b66a-73670a2a4855", "eba9e563-bba1-4b58-9e4f-e688c8ff771f"};
		
		String diahyp = "diabetehypertension.csv";
		String obe = "obesity.csv";
		PrintWriter pw = new PrintWriter(new File(diahyp));
		StringBuilder sb = new StringBuilder();
//        sb.append("id");
//        sb.append(',');
//        sb.append("Name");
//        sb.append('\n');
//
//        sb.append("1");
//        sb.append(',');
//        sb.append("Prashant Ghimire");
//        sb.append('\n');
		System.out.println(dhList.length);
        for (int i = 0; i< dhList.length; i++) {
        	sb.append(dhList[i]);
        	sb.append('\n');
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
	}
	

}
