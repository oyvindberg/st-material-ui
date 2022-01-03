package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/CardContent/cardContentClasses.CardContentClasses> */
@js.native
trait PartialCardContentClasses extends StObject {
  
  var root: js.UndefOr[String] = js.native
}
object PartialCardContentClasses {
  
  @scala.inline
  def apply(): PartialCardContentClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardContentClasses]
  }
  
  @scala.inline
  implicit class PartialCardContentClassesMutableBuilder[Self <: PartialCardContentClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
