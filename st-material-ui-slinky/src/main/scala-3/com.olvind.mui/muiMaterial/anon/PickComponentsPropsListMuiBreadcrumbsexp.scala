package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ComponentsPropsList['MuiBreadcrumbs'], 'expandText'> */
trait PickComponentsPropsListMuiBreadcrumbsexp extends StObject {
  
  var expandText: js.UndefOr[String] = js.undefined
}
object PickComponentsPropsListMuiBreadcrumbsexp {
  
  inline def apply(): PickComponentsPropsListMuiBreadcrumbsexp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMuiBreadcrumbsexp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickComponentsPropsListMuiBreadcrumbsexp] (val x: Self) extends AnyVal {
    
    inline def setExpandText(value: String): Self = StObject.set(x, "expandText", value.asInstanceOf[js.Any])
    
    inline def setExpandTextUndefined: Self = StObject.set(x, "expandText", js.undefined)
  }
}
