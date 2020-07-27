using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Identity;
using Microsoft.AspNetCore.Mvc;
using Pidev.Models;

namespace Pidev.Controllers
{

    public class EvaluationController : Controller
    {
        [Authorize]
        public IActionResult Index()
        {
            return View();
        }

        [Authorize]
        public IActionResult Create()
        {
            return View();
        }

        [Authorize]
        public IActionResult Note(int id)
        {
            ViewBag.Id = id;

            return View();
        }

        [Authorize]
        public IActionResult Print(int id)
        {
            ViewBag.Id = id;

            return View();
        }
    }
}
