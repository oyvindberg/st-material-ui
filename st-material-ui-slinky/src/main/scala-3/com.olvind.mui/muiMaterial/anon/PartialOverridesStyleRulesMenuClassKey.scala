package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<MenuClassKey>> */
trait PartialOverridesStyleRulesMenuClassKey extends StObject {
  
  var list: js.UndefOr[CSSInterpolation] = js.undefined
  
  var paper: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesMenuClassKey {
  
  inline def apply(): PartialOverridesStyleRulesMenuClassKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesMenuClassKey]
  }
  
  extension [Self <: PartialOverridesStyleRulesMenuClassKey](x: Self) {
    
    inline def setList(value: CSSInterpolation): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListNull: Self = StObject.set(x, "list", null)
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setPaper(value: CSSInterpolation): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperNull: Self = StObject.set(x, "paper", null)
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
