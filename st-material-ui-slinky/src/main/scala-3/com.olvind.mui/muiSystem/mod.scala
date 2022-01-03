package com.olvind.mui.muiSystem

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // breakpoints.js
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiSystem.muiSystemStrings.xs
    - `com.olvind.mui`.muiSystem.muiSystemStrings.sm
    - `com.olvind.mui`.muiSystem.muiSystemStrings.md
    - `com.olvind.mui`.muiSystem.muiSystemStrings.lg
    - `com.olvind.mui`.muiSystem.muiSystemStrings.xl
  */
  trait DefaultBreakPoints extends StObject
  object DefaultBreakPoints {
    
    inline def lg: com.olvind.mui.muiSystem.muiSystemStrings.lg = "lg".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.lg]
    
    inline def md: com.olvind.mui.muiSystem.muiSystemStrings.md = "md".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.md]
    
    inline def sm: com.olvind.mui.muiSystem.muiSystemStrings.sm = "sm".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.sm]
    
    inline def xl: com.olvind.mui.muiSystem.muiSystemStrings.xl = "xl".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.xl]
    
    inline def xs: com.olvind.mui.muiSystem.muiSystemStrings.xs = "xs".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.xs]
  }
  
  type ResponsiveStyleValue[T] = T | (js.Array[T | Null]) | (StringDictionary[T | Null])
}
