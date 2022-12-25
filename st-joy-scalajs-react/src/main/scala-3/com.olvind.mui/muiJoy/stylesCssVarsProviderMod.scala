package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.PropsWithChildrenPartialCssVarsProviderC
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesCssVarsProviderMod {
  
  @JSImport("@mui/joy/styles/CssVarsProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(useColorScheme, getInitColorSchemeScript) */ inline def CssVarsProvider(props: PropsWithChildrenPartialCssVarsProviderC): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CssVarsProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def shouldSkipGeneratingVar(keys: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldSkipGeneratingVar")(keys.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
