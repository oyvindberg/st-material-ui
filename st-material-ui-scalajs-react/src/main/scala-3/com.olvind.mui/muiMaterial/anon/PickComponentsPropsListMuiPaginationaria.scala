package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@mui/material.@mui/material/styles/props.ComponentsPropsList['MuiPagination'], 'aria-label' | 'getItemAriaLabel'> */
trait PickComponentsPropsListMuiPaginationaria extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var getItemAriaLabel: js.UndefOr[
    js.Function3[
      /* type */ "page" | "first" | "last" | "next" | "previous", 
      /* page */ Double, 
      /* selected */ Boolean, 
      String
    ]
  ] = js.undefined
}
object PickComponentsPropsListMuiPaginationaria {
  
  inline def apply(): PickComponentsPropsListMuiPaginationaria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMuiPaginationaria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickComponentsPropsListMuiPaginationaria] (val x: Self) extends AnyVal {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def setGetItemAriaLabel(
      value: (/* type */ "page" | "first" | "last" | "next" | "previous", /* page */ Double, /* selected */ Boolean) => String
    ): Self = StObject.set(x, "getItemAriaLabel", js.Any.fromFunction3(value))
    
    inline def setGetItemAriaLabelUndefined: Self = StObject.set(x, "getItemAriaLabel", js.undefined)
  }
}
