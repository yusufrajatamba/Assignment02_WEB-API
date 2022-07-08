import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

var01 = WS.sendRequest(findTestObject('Web API/Posts/GET'))

WS.verifyResponseStatusCode(this.var01, 200)

assert var01.getStatusCode() == 200

WS.verifyElementPropertyValue(var01, '[0].userId', '1')

WS.verifyElementPropertyValue(var01, '[0].id', '1')

WS.verifyElementPropertyValue(var01, '[0].title', 'sunt aut facere repellat provident occaecati excepturi optio reprehenderit')

WS.verifyElementPropertyValue(var01, '[0].body', 'quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto')

WS.verifyElementPropertyValue(var01, '[1].userId', '1')

WS.verifyElementPropertyValue(var01, '[1].id', '2')

WS.verifyElementPropertyValue(var01, '[1].title', 'qui est esse')

WS.verifyElementPropertyValue(var01, '[1].body', 'est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla')

WS.verifyElementPropertyValue(var01, '[11].userId', '2')

WS.verifyElementPropertyValue(var01, '[11].id', '12')

WS.verifyElementPropertyValue(var01, '[11].title', 'in quibusdam tempore odit est dolorem')

WS.verifyElementPropertyValue(var01, '[11].body', 'itaque id aut magnam\npraesentium quia et ea odit et ea voluptas et\nsapiente quia nihil amet occaecati quia id voluptatem\nincidunt ea est distinctio odio')

WS.verifyElementPropertyValue(var01, '[12].userId', '2')

WS.verifyElementPropertyValue(var01, '[12].id', '13')

WS.verifyElementPropertyValue(var01, '[12].title', 'dolorum ut in voluptas mollitia et saepe quo animi')

WS.verifyElementPropertyValue(var01, '[12].body', 'aut dicta possimus sint mollitia voluptas commodi quo doloremque\niste corrupti reiciendis voluptatem eius rerum\nsit cumque quod eligendi laborum minima\nperferendis recusandae assumenda consectetur porro architecto ipsum ipsam')

WS.verifyElementPropertyValue(var01, '[13].userId', '2')

WS.verifyElementPropertyValue(var01, '[13].id', '14')

WS.verifyElementPropertyValue(var01, '[13].title', 'voluptatem eligendi optio')

WS.verifyElementPropertyValue(var01, '[13].body', 'fuga et accusamus dolorum perferendis illo voluptas\nnon doloremque neque facere\nad qui dolorum molestiae beatae\nsed aut voluptas totam sit illum')

WS.verifyElementPropertyValue(var01, '[20].userId', '3')

WS.verifyElementPropertyValue(var01, '[20].id', '21')

WS.verifyElementPropertyValue(var01, '[20].title', 'asperiores ea ipsam voluptatibus modi minima quia sint')

WS.verifyElementPropertyValue(var01, '[20].body', 'repellat aliquid praesentium dolorem quo\nsed totam minus non itaque\nnihil labore molestiae sunt dolor eveniet hic recusandae veniam\ntempora et tenetur expedita sunt')

WS.verifyElementPropertyValue(var01, '[25].userId', '3')

WS.verifyElementPropertyValue(var01, '[25].id', '26')

WS.verifyElementPropertyValue(var01, '[25].title', 'est et quae odit qui non')

WS.verifyElementPropertyValue(var01, '[25].body', 'similique esse doloribus nihil accusamus\nomnis dolorem fuga consequuntur reprehenderit fugit recusandae temporibus\nperspiciatis cum ut laudantium\nomnis aut molestiae vel vero')

WS.verifyElementPropertyValue(var01, '[26].userId', '3')

WS.verifyElementPropertyValue(var01, '[26].id', '27')

WS.verifyElementPropertyValue(var01, '[26].title', 'quasi id et eos tenetur aut quo autem')

WS.verifyElementPropertyValue(var01, '[26].body', 'eum sed dolores ipsam sint possimus debitis occaecati\ndebitis qui qui et\nut placeat enim earum aut odit facilis\nconsequatur suscipit necessitatibus rerum sed inventore temporibus consequatur')

WS.verifyElementPropertyValue(var01, '[27].userId', '3')

WS.verifyElementPropertyValue(var01, '[27].id', '28')

WS.verifyElementPropertyValue(var01, '[27].title', 'delectus ullam et corporis nulla voluptas sequi')

WS.verifyElementPropertyValue(var01, '[27].body', 'non et quaerat ex quae ad maiores\nmaiores recusandae totam aut blanditiis mollitia quas illo\nut voluptatibus voluptatem\nsimilique nostrum eum')

WS.verifyElementPropertyValue(var01, '[28].userId', '3')

WS.verifyElementPropertyValue(var01, '[28].id', '29')

WS.verifyElementPropertyValue(var01, '[28].title', 'iusto eius quod necessitatibus culpa ea')

WS.verifyElementPropertyValue(var01, '[28].body', 'odit magnam ut saepe sed non qui\ntempora atque nihil\naccusamus illum doloribus illo dolor\neligendi repudiandae odit magni similique sed cum maiores')

WS.verifyElementPropertyValue(var01, '[30].userId', '4')

WS.verifyElementPropertyValue(var01, '[30].id', '31')

WS.verifyElementPropertyValue(var01, '[30].title', 'ullam ut quidem id aut vel consequuntur')

WS.verifyElementPropertyValue(var01, '[30].body', 'debitis eius sed quibusdam non quis consectetur vitae\nimpedit ut qui consequatur sed aut in\nquidem sit nostrum et maiores adipisci atque\nquaerat voluptatem adipisci repudiandae')

