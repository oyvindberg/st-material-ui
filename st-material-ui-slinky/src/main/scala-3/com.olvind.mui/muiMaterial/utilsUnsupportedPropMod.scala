package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsUnsupportedPropMod {
  
  @JSImport("@mui/material/utils/unsupportedProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], location.asInstanceOf[js.Any], propFullName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
}
