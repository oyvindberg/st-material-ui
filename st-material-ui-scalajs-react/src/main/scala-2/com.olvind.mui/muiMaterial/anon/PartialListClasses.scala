package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/List/listClasses.ListClasses> */
@js.native
trait PartialListClasses extends StObject {
  
  var dense: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var subheader: js.UndefOr[String] = js.native
}
object PartialListClasses {
  
  @scala.inline
  def apply(): PartialListClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListClasses]
  }
  
  @scala.inline
  implicit class PartialListClassesMutableBuilder[Self <: PartialListClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSubheader(value: String): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
  }
}
