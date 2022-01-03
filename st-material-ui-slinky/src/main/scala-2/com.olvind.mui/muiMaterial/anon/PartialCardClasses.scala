package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Card/cardClasses.CardClasses> */
@js.native
trait PartialCardClasses extends StObject {
  
  var root: js.UndefOr[String] = js.native
}
object PartialCardClasses {
  
  @scala.inline
  def apply(): PartialCardClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardClasses]
  }
  
  @scala.inline
  implicit class PartialCardClassesMutableBuilder[Self <: PartialCardClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
