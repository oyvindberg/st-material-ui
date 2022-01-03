package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<ListClassKey>> */
trait PartialOverridesStyleRulesListClassKey extends StObject {
  
  var dense: js.UndefOr[CSSInterpolation] = js.undefined
  
  var padding: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
  
  var subheader: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesListClassKey {
  
  inline def apply(): PartialOverridesStyleRulesListClassKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesListClassKey]
  }
  
  extension [Self <: PartialOverridesStyleRulesListClassKey](x: Self) {
    
    inline def setDense(value: CSSInterpolation): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseNull: Self = StObject.set(x, "dense", null)
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setPadding(value: CSSInterpolation): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingNull: Self = StObject.set(x, "padding", null)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSubheader(value: CSSInterpolation): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    inline def setSubheaderNull: Self = StObject.set(x, "subheader", null)
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
  }
}
