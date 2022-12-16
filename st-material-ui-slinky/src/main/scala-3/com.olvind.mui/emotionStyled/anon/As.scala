package com.olvind.mui.emotionStyled.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As extends StObject {
  
  var as: js.UndefOr[ReactElement] = js.undefined
  
  var theme: js.UndefOr[com.olvind.mui.emotionReact.mod.Theme] = js.undefined
}
object As {
  
  inline def apply(): As = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: As] (val x: Self) extends AnyVal {
    
    inline def setAs(value: ReactElement): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setTheme(value: com.olvind.mui.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
