package com.olvind.mui.emotionStyled.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends StObject {
  
  var theme: com.olvind.mui.emotionReact.emotionReactMod.Theme = js.native
}
object Theme {
  
  @scala.inline
  def apply(theme: com.olvind.mui.emotionReact.emotionReactMod.Theme): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(value: com.olvind.mui.emotionReact.emotionReactMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
