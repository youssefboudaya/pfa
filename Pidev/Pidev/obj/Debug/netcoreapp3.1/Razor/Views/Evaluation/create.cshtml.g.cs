#pragma checksum "C:\Users\artan\source\repos\Pidev\Pidev\Views\Evaluation\create.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "1858345583737eacd031c565cca092c86413017b"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Evaluation_create), @"mvc.1.0.view", @"/Views/Evaluation/create.cshtml")]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#nullable restore
#line 1 "C:\Users\artan\source\repos\Pidev\Pidev\Views\_ViewImports.cshtml"
using Pidev;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\artan\source\repos\Pidev\Pidev\Views\_ViewImports.cshtml"
using Pidev.Models;

#line default
#line hidden
#nullable disable
#nullable restore
#line 1 "C:\Users\artan\source\repos\Pidev\Pidev\Views\Evaluation\create.cshtml"
using Microsoft.AspNetCore.Identity;

#line default
#line hidden
#nullable disable
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"1858345583737eacd031c565cca092c86413017b", @"/Views/Evaluation/create.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"3bd2ed1707854926be090d816a2cf8b228ab9210", @"/Views/_ViewImports.cshtml")]
    public class Views_Evaluation_create : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    {
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_0 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("value", "FIN_ANNEE", global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_1 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("value", "SEMESTRIEL", global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_2 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("value", "FIN_PROJET", global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_3 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("class", new global::Microsoft.AspNetCore.Html.HtmlString("form-horizontal form-material"), global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_4 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("id", new global::Microsoft.AspNetCore.Html.HtmlString("create-evaluation-sheet"), global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_5 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("id", new global::Microsoft.AspNetCore.Html.HtmlString("create-Indicator-form"), global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        #line hidden
        #pragma warning disable 0649
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperExecutionContext __tagHelperExecutionContext;
        #pragma warning restore 0649
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner __tagHelperRunner = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner();
        #pragma warning disable 0169
        private string __tagHelperStringValueBuffer;
        #pragma warning restore 0169
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __backed__tagHelperScopeManager = null;
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __tagHelperScopeManager
        {
            get
            {
                if (__backed__tagHelperScopeManager == null)
                {
                    __backed__tagHelperScopeManager = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager(StartTagHelperWritingScope, EndTagHelperWritingScope);
                }
                return __backed__tagHelperScopeManager;
            }
        }
        private global::Microsoft.AspNetCore.Mvc.TagHelpers.FormTagHelper __Microsoft_AspNetCore_Mvc_TagHelpers_FormTagHelper;
        private global::Microsoft.AspNetCore.Mvc.TagHelpers.RenderAtEndOfFormTagHelper __Microsoft_AspNetCore_Mvc_TagHelpers_RenderAtEndOfFormTagHelper;
        private global::Microsoft.AspNetCore.Mvc.TagHelpers.OptionTagHelper __Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper;
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            WriteLiteral("\r\n");
#nullable restore
#line 5 "C:\Users\artan\source\repos\Pidev\Pidev\Views\Evaluation\create.cshtml"
  
    ViewData["Title"] = "Evaluation";
    Layout = "~/Views/Shared/_Layout.cshtml";

#line default
#line hidden
#nullable disable
            WriteLiteral("\r\n    <div class=\"col-md-12 col-xs-12\">\r\n        <div class=\"white-box\">\r\n            ");
            __tagHelperExecutionContext = __tagHelperScopeManager.Begin("form", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "1858345583737eacd031c565cca092c86413017b5869", async() => {
                WriteLiteral(@"
                <div class=""row"">
                    <div class=""col-md-4"">
                        <div class=""form-group"">
                            <label class=""col-md-12"">Subject</label>
                            <div class=""col-md-12"">
                                <select class=""form-control"" id=""evaluation-subject"" required>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class=""col-md-4"">
                        <div class=""form-group"">
                            <label class=""col-md-12"">Type</label>
                            <div class=""col-md-12"">
                                <select class=""form-control"" id=""evaluation-type"" required>
                                    ");
                __tagHelperExecutionContext = __tagHelperScopeManager.Begin("option", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "1858345583737eacd031c565cca092c86413017b6982", async() => {
                    WriteLiteral("End Of Year");
                }
                );
                __Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.TagHelpers.OptionTagHelper>();
                __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper);
                __Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper.Value = (string)__tagHelperAttribute_0.Value;
                __tagHelperExecutionContext.AddTagHelperAttribute(__tagHelperAttribute_0);
                await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
                if (!__tagHelperExecutionContext.Output.IsContentModified)
                {
                    await __tagHelperExecutionContext.SetOutputContentAsync();
                }
                Write(__tagHelperExecutionContext.Output);
                __tagHelperExecutionContext = __tagHelperScopeManager.End();
                WriteLiteral("\r\n                                    ");
                __tagHelperExecutionContext = __tagHelperScopeManager.Begin("option", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "1858345583737eacd031c565cca092c86413017b8246", async() => {
                    WriteLiteral("Half-annual");
                }
                );
                __Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.TagHelpers.OptionTagHelper>();
                __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper);
                __Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper.Value = (string)__tagHelperAttribute_1.Value;
                __tagHelperExecutionContext.AddTagHelperAttribute(__tagHelperAttribute_1);
                await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
                if (!__tagHelperExecutionContext.Output.IsContentModified)
                {
                    await __tagHelperExecutionContext.SetOutputContentAsync();
                }
                Write(__tagHelperExecutionContext.Output);
                __tagHelperExecutionContext = __tagHelperScopeManager.End();
                WriteLiteral("\r\n                                    ");
                __tagHelperExecutionContext = __tagHelperScopeManager.Begin("option", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "1858345583737eacd031c565cca092c86413017b9510", async() => {
                    WriteLiteral("End Of Project");
                }
                );
                __Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.TagHelpers.OptionTagHelper>();
                __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper);
                __Microsoft_AspNetCore_Mvc_TagHelpers_OptionTagHelper.Value = (string)__tagHelperAttribute_2.Value;
                __tagHelperExecutionContext.AddTagHelperAttribute(__tagHelperAttribute_2);
                await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
                if (!__tagHelperExecutionContext.Output.IsContentModified)
                {
                    await __tagHelperExecutionContext.SetOutputContentAsync();
                }
                Write(__tagHelperExecutionContext.Output);
                __tagHelperExecutionContext = __tagHelperScopeManager.End();
                WriteLiteral(@"
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class=""col-md-4"">
                        <div class=""form-group"">
                            <label class=""col-md-12"">Available Until</label>
                            <div class=""col-md-12"">
                                <input type=""date"" class=""form-control"" id=""available-until"" required>
                            </div>
                        </div>
                    </div>
                    <button class=""btn btn-success pull-right mb-2"" id=""create-evaluation"">Create Evaluation Sheet</button>
                </div>
            ");
            }
            );
            __Microsoft_AspNetCore_Mvc_TagHelpers_FormTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.TagHelpers.FormTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_TagHelpers_FormTagHelper);
            __Microsoft_AspNetCore_Mvc_TagHelpers_RenderAtEndOfFormTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.TagHelpers.RenderAtEndOfFormTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_TagHelpers_RenderAtEndOfFormTagHelper);
            __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_3);
            __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_4);
            await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
            if (!__tagHelperExecutionContext.Output.IsContentModified)
            {
                await __tagHelperExecutionContext.SetOutputContentAsync();
            }
            Write(__tagHelperExecutionContext.Output);
            __tagHelperExecutionContext = __tagHelperScopeManager.End();
            WriteLiteral("\r\n        </div>\r\n\r\n        <div class=\"white-box\" id=\"indicator-div\" hidden>\r\n            ");
            __tagHelperExecutionContext = __tagHelperScopeManager.Begin("form", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "1858345583737eacd031c565cca092c86413017b12721", async() => {
                WriteLiteral(@"
                <div class=""row"">
                    <div class=""col-md-6"">
                        <div class=""form-group"">
                            <div class=""row"">
                                <label class=""col-md-12"">Indicator</label>
                                <div class=""col-md-12"">
                                    <input type=""text"" class=""form-control"" id=""indicator-label"" required>
                                </div>
                            </div>

                            <div class=""row"">
                                <div class=""col-md-12"">
                                    <h3>Indicators</h3>

                                    <ul class=""list-group"" id=""indicators-list"">
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class=""col-md-6"">
                        <div class=""form-group"">
         ");
                WriteLiteral(@"                   <div class=""row"">
                                <label class=""col-md-12"">Question</label>
                                <div class=""col-md-8"">
                                    <input type=""text"" class=""form-control"" id=""new-question"">
                                </div>
                                <div class=""col-md-4"">
                                    <button type=""button"" id=""add-new-question"">+</button>
                                </div>
                            </div>
                            <div class=""row"">
                                <div class=""col-md-12"">
                                    <h3>Questions</h3>

                                    <ul class=""list-group"" id=""question-list"">
                                    </ul>
                                </div>
                            </div>
                        </div>
                    <button class=""btn btn-success pull-right mb-2"" id=""create-Indicator-btn"" disabled");
                WriteLiteral(">Create Indicator</button>\r\n                </div>\r\n            ");
            }
            );
            __Microsoft_AspNetCore_Mvc_TagHelpers_FormTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.TagHelpers.FormTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_TagHelpers_FormTagHelper);
            __Microsoft_AspNetCore_Mvc_TagHelpers_RenderAtEndOfFormTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.TagHelpers.RenderAtEndOfFormTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_TagHelpers_RenderAtEndOfFormTagHelper);
            __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_3);
            __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_5);
            await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
            if (!__tagHelperExecutionContext.Output.IsContentModified)
            {
                await __tagHelperExecutionContext.SetOutputContentAsync();
            }
            Write(__tagHelperExecutionContext.Output);
            __tagHelperExecutionContext = __tagHelperScopeManager.End();
            WriteLiteral("\r\n        </div>\r\n    </div>\r\n\r\n");
            DefineSection("Scripts", async() => {
                WriteLiteral("\r\n    <script>\r\n        $(document).ready(function () {\r\n            var userEmail = \"");
#nullable restore
#line 99 "C:\Users\artan\source\repos\Pidev\Pidev\Views\Evaluation\create.cshtml"
                        Write(User.Identity.Name);

#line default
#line hidden
#nullable disable
                WriteLiteral(@""";
            var user = null;
            var evaluationId = null;
            var lastIndicatorId = null;
            var questions = [];

            var today = new Date();
            var dd = today.getDate();
            var mm = today.getMonth() + 1;
            var yyyy = today.getFullYear();

            today = yyyy + '-' + mm + '-' + dd;

            $.ajax({
                type: ""GET"",
                url: `http://localhost:9080/pidev.rest-0.0.1-SNAPSHOT/restfull/evaluations/${userEmail}/user`,
                success: (response) => {
                    user = response[0];
                }
            });

            $.ajax({
                type: ""GET"",
                url: `http://localhost:9080/pidev.rest-0.0.1-SNAPSHOT/restfull/evaluations/all-users`,
                success: (response) => {
                    response.forEach((single) => {
                        $(""#evaluation-subject"").append(`<option value=""${single.idUser}"">${single.name}</option>`)
      ");
                WriteLiteral(@"              });
                }
            });

            $(""#create-evaluation-sheet"").submit((e) => {
                e.preventDefault();
                
                $.ajax({
                    type: ""POST"",
                    headers: {
                        ""Content-Type"": ""application/json; charset=utf8"",
                    },
                    url: ""http://localhost:9080/pidev.rest-0.0.1-SNAPSHOT/restfull/evaluations"",
                    data: JSON.stringify({
                        ""creatorId"": user.id,
                        ""subjectId"": parseInt($(""#evaluation-subject"").val()),
                        ""type"": $(""#evaluation-type"").val(),
                        ""createdAt"": today,
                        ""availableUntil"": $(""#available-until"").val()
                    }),
                    success: function (response) {
                        evaluationId = response.id;
                        $(""#create-evaluation"").prop(""disabled"", true);
           ");
                WriteLiteral(@"             $(""#indicator-div"").show(600);
                    },
                });
            });

            $(""#add-new-question"").click(() => {
                let question = $(""#new-question"").val();

                if (question) {
                    questions.push(question);
                    $(""#question-list"").append(`<li class=""list-group-item"">${question} ?</li>`);
                    $(""#new-question"").val("""");

                    $(""#create-Indicator-btn"").prop(""disabled"", false);
                }
            });

            $(""#create-Indicator-form"").submit((e) => {
                e.preventDefault();

                $.ajax({
                    type: ""POST"",
                    headers: {
                        ""Content-Type"": ""application/json; charset=utf8"",
                    },
                    url: ""http://localhost:9080/pidev.rest-0.0.1-SNAPSHOT/restfull/indicators"",
                    data: JSON.stringify({
                        ""evaluationS");
                WriteLiteral(@"heetId"": evaluationId,
                        ""label"": $(""#indicator-label"").val()
                    }),
                    success: function (response) {
                        lastIndicatorId = response.id;

                        if (lastIndicatorId) {
                            questions.forEach((q) => {
                                $.ajax({
                                    type: ""POST"",
                                    headers: {
                                        ""Content-Type"": ""application/json; charset=utf8"",
                                    },
                                    url: ""http://localhost:9080/pidev.rest-0.0.1-SNAPSHOT/restfull/questions"",
                                    data: JSON.stringify({
                                        ""indicatorId"": lastIndicatorId,
                                        ""question"": q
                                    }),
                                    success: function (response) {
                       ");
                WriteLiteral(@"                 
                                    },
                                });
                            });

                            let tmp_indicator = $(""#indicator-label"").val();

                            $(""#indicators-list"").append(`<li class=""list-group-item"">${tmp_indicator}</li>`)

                            $(""#new-question"").val("""");
                            $(""#indicator-label"").val("""");
                            $(""#question-list"").html("""");

                            $(""#create-Indicator-btn"").prop(""disabled"", true);

                            questions = [];
                        }
                    },
                });
            });
        });
    </script>
");
            }
            );
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public UserManager<IdentityUser> UserManager { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public SignInManager<IdentityUser> SignInManager { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<dynamic> Html { get; private set; }
    }
}
#pragma warning restore 1591
