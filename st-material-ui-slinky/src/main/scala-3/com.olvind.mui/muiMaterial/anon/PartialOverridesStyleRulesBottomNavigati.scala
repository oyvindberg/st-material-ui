package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<BottomNavigationClassKey>> */
trait PartialOverridesStyleRulesBottomNavigati extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesBottomNavigati {
  
  inline def apply(): PartialOverridesStyleRulesBottomNavigati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesBottomNavigati]
  }
  
  extension [Self <: PartialOverridesStyleRulesBottomNavigati](x: Self) {
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
