package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<ListItemIconClassKey>> */
trait PartialOverridesStyleRulesListItemIconCl extends StObject {
  
  var alignItemsFlexStart: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesListItemIconCl {
  
  inline def apply(): PartialOverridesStyleRulesListItemIconCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesListItemIconCl]
  }
  
  extension [Self <: PartialOverridesStyleRulesListItemIconCl](x: Self) {
    
    inline def setAlignItemsFlexStart(value: CSSInterpolation): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsFlexStartNull: Self = StObject.set(x, "alignItemsFlexStart", null)
    
    inline def setAlignItemsFlexStartUndefined: Self = StObject.set(x, "alignItemsFlexStart", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
