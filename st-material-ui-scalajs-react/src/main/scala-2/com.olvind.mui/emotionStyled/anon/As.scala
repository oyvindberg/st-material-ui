package com.olvind.mui.emotionStyled.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait As extends StObject {
  
  var as: js.UndefOr[ElementType] = js.native
  
  var theme: js.UndefOr[com.olvind.mui.emotionReact.emotionReactMod.Theme] = js.native
}
object As {
  
  @scala.inline
  def apply(): As = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As]
  }
  
  @scala.inline
  implicit class AsMutableBuilder[Self <: As] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setTheme(value: com.olvind.mui.emotionReact.emotionReactMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
