__author__ = 'zyt'

class Solution:
    # @param {integer} A
    # @param {integer} B
    # @param {integer} C
    # @param {integer} D
    # @param {integer} E
    # @param {integer} F
    # @param {integer} G
    # @param {integer} H
    # @return {integer}
    def computeArea(self, A, B, C, D, E, F, G, H):
        areaA = (C - A) * (D - B)
        areaB = (G - E) * (H - F)
        l = max(0, min(C, G) - max(A, E))
        h = max(0, min(D, H) - max(B, F))
        return areaA + areaB - l * h
